package com.functionaiInterfaces.dateutils;
import java.time.LocalDate;

public class InvoiceGenerator {

    public static void main(String[] args) {

        LocalDate invoiceDate = LocalDate.now();

        String format1 = DateUtils.formatDate(invoiceDate, "dd-MM-yyyy");
        String format2 = DateUtils.formatDate(invoiceDate, "yyyy/MM/dd");
        String format3 = DateUtils.formatDate(invoiceDate, "MMM dd, yyyy");

        System.out.println("Invoice Date (Format 1): " + format1);
        System.out.println("Invoice Date (Format 2): " + format2);
        System.out.println("Invoice Date (Format 3): " + format3);
    }
}
