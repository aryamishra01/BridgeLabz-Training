package com.streamsapi;

import java.util.*;
import java.time.LocalDate;

class Member {
    String name;
    LocalDate expiryDate;

    Member(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }
}


public class ExpiringMemberships {
    public static void main(String[] args) {

        List<Member> members = Arrays.asList(
            new Member("Amit", LocalDate.now().plusDays(10)),
            new Member("Neha", LocalDate.now().plusDays(40)),
            new Member("Ravi", LocalDate.now().plusDays(25))
        );

        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        members.stream()
               // filter members expiring within 30 days
               .filter(m -> m.expiryDate.isAfter(today)
                         && m.expiryDate.isBefore(next30Days))
               // print member name
               .forEach(m -> System.out.println(m.name));
    }
}

