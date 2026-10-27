package com.pluralsight;


import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {


        try {
            FileReader fileReader = new FileReader("employees.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            bufferedReader.readLine()

        } catch (Exception e) {
            throw new RuntimeException(e);
        }




    }
}