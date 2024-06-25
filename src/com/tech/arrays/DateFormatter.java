package com.tech.arrays;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

//"yyyy-MM-dd'T'HH:mm:ss"

public class DateFormatter {
	public static void main(String[] args) {
        String dateString = "20/06/2024";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            String date = LocalDate.parse(dateString, formatter).format(formatter);
            System.out.println("Converted date: " + date);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format: " + dateString);
        }
    }
}
