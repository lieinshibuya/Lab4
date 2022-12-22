package com.company;

import java.io.IOException;
import java.util.*;

/**
 * The Main class.
 */
public class Main {
    /**
     * The main method
     * @param args the Main arguments
     * @throws IOException An exception that is thrown when an I/O error occurs
     */
    public static  void main(String[] args) throws IOException {
        List<Person> prsn; String exit_code;
        CSVparser reader = new CSVparser();
        Scanner in = new Scanner(System.in);
        do {
            prsn = reader.fileRead();

            for (int i = 1; i < prsn.size(); i++)
                System.out.println(prsn.get(i));
            System.out.println("Enter 'e' to exit.");
            exit_code = in.nextLine();
        } while (!Objects.equals(exit_code, "e"));
    }
}
