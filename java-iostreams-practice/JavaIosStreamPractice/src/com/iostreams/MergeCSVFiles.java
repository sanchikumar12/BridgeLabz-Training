package com.iostreams;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MergeCSVFiles {

    public static void main(String[] args) {

        String file1 = "C:\\Users\\thisi\\OneDrive\\Desktop\\confident\\students1.csv";;
        String file2 = "C:\\\\Users\\\\thisi\\\\OneDrive\\\\Desktop\\\\confident\\\\students2.csv";
        String outputFile = "C:\\\\Users\\\\thisi\\\\OneDrive\\\\Desktop\\\\confident\\\\students_merged.csv";

        Map<String, String[]> studentMap = new HashMap<>();

        try (
                CSVReader reader1 = new CSVReader(new FileReader(file1));
                CSVReader reader2 = new CSVReader(new FileReader(file2));
                CSVWriter writer = new CSVWriter(new FileWriter(outputFile))
        ) {

            String[] row;

            reader1.readNext(); 

            while ((row = reader1.readNext()) != null) {

                studentMap.put(row[0], new String[]{row[1], row[2]});
            }		

            writer.writeNext(new String[]{"ID", "Name", "Age", "Marks", "Grade"});

            reader2.readNext(); 

            while ((row = reader2.readNext()) != null) {

                String id = row[0];

                if (studentMap.containsKey(id)) {
                    String[] studentInfo = studentMap.get(id);

                    writer.writeNext(new String[]{
                            id,
                            studentInfo[0], 
                            studentInfo[1], 
                            row[1],         
                            row[2]          
                    });
                }
            }

            System.out.println("CSV files merged successfully into students_merged.csv");

        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
    }
}