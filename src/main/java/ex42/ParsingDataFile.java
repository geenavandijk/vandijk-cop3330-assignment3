/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Geena-Maria van Dijk
 */

package ex42;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ParsingDataFile {
    public static void main (String[] args) throws Exception {

        FileReader fr = new FileReader("C:\\Users\\geena\\IdeaProjects\\untitled1\\untitled1\\vandijk-cop3330\\vandijk-cop3330-assignment3\\src\\main\\java\\ex42\\exercise42_input.txt");

        int i;
        String s = "";
        System.out.printf("%10s %10s %10s\n %10s \n", "Last", "First", "Salary", "    --------------------------");

        while ((i = fr.read()) != -1){
             if (Character.compare((char)i, '\n') == 0) {
                 String[] pieces = s.split(",");
                 System.out.printf("%10s %10s %10s\n", pieces[0], pieces[1], pieces[2]);
                 s = "";
             }
             else
                 s+=(char)i;
        }

    }
}
