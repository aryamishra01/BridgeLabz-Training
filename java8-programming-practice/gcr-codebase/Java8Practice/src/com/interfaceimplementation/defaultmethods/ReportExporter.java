package com.interfaceimplementation.defaultmethods;

interface Exporter {

    void export();

    // New feature added later
    default void exportToJSON() {
        System.out.println("Exporting report to JSON format");
    }
}

class CSVExporter implements Exporter {

    public void export() {
        System.out.println("Exporting report to CSV");
    }
}

class PDFExporter implements Exporter {

    public void export() {
        System.out.println("Exporting report to PDF");
    }
}

public class ReportExporter {

    public static void main(String[] args) {

        Exporter csv = new CSVExporter();
        Exporter pdf = new PDFExporter();

        csv.export();
        csv.exportToJSON();

        pdf.export();
        pdf.exportToJSON();
    }
}
