package com.functionaiInterfaces.dateutils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface DateUtils {

 static String formatDate(LocalDate date, String pattern) {

     if (date == null || pattern == null) {
         return "Invalid date or pattern";
     }

     DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
     return date.format(formatter);
 }
}
