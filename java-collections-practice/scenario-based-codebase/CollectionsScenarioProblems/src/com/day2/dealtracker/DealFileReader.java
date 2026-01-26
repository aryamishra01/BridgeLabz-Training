package com.day2.dealtracker;

import java.io.*;
import java.time.*;
import java.time.format.*;
import java.util.*;
import java.util.regex.*;

public class DealFileReader {

    static Pattern codeP = Pattern.compile("DealCode:\\s*(\\w+)");
    static Pattern dateP = Pattern.compile("ValidTill:\\s*(\\d{2}-\\d{2}-\\d{4})");
    static Pattern discP = Pattern.compile("Discount:\\s*(\\d+)%");
    static Pattern minP  = Pattern.compile("MinimumPurchase:\\s*(\\d+)");

    public static <T> List<Deal<T>> readDeals(String path, T promoType) throws Exception {

        FileInputStream fis = new FileInputStream(path);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        List<Deal<T>> list = new ArrayList<>();

        String line, block = "";

        while ((line = br.readLine()) != null) {

            if (line.trim().isEmpty()) {
                Deal<T> d = parseBlock(block, promoType);
                if (d != null) list.add(d);
                block = "";
            } else {
                block += line + "\n";
            }
        }

        if (!block.isEmpty()) {
            Deal<T> d = parseBlock(block, promoType);
            if (d != null) list.add(d);
        }

        br.close();
        return list;
    }

    private static <T> Deal<T> parseBlock(String text, T promoType) {

        try {
            Matcher m1 = codeP.matcher(text);
            Matcher m2 = dateP.matcher(text);
            Matcher m3 = discP.matcher(text);
            Matcher m4 = minP.matcher(text);

            if (!(m1.find() && m2.find() && m3.find() && m4.find()))
                return null;

            String code = m1.group(1);
            LocalDate date = LocalDate.parse(m2.group(1),
                    DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            int discount = Integer.parseInt(m3.group(1));
            int min = Integer.parseInt(m4.group(1));

            if (date.isBefore(LocalDate.now()))
                return null; // expired

            return new Deal<>(code, date, discount, min, promoType);

        } catch (Exception e) {
            return null;
        }
    }
}

