package com.company;

import java.util.*;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import com.opencsv.CSVReader;
import java.io.IOException;
import org.apache.commons.io.FilenameUtils;

public class CSVparser {

    private String filepath;

    private boolean correct_input_filepath(String path) {
        File file = new File(path);
        if (file.exists() && FilenameUtils.getExtension(path).equals("csv")) {
            filepath = path;
            return true;
        }
        return false;
    }

    private String check_input() {
        Scanner in = new Scanner(System.in);
        String path = "";
        System.out.println("Enter the file path: ");
        if (in.hasNextLine())
            path = in.nextLine();
        while (!correct_input_filepath(path)) {
            System.out.println("Invalid input. Enter the file path again:");
            if (in.hasNextLine())
                path = in.nextLine();
        }
        return path;
    }

    public List<Person> fileRead() throws IOException {
        int num;
        List<Person> prsn = new ArrayList();

        if (correct_input_filepath(check_input())) {

            FileReader file = new FileReader(filepath);
            CSVReader reader = new CSVReader(file, ';');
            String[] nextStr;

            while ((nextStr = reader.readNext()) != null) {
                Random rndm = new Random();
                num = rndm.nextInt(25000);
                prsn.add(new Person(nextStr[0], nextStr[1], nextStr[2], nextStr[5], nextStr[3], nextStr[4], num));
            }
        }
        return prsn;
    }
}
