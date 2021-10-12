/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Geena-Maria van Dijk
 */

package ex41;

import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NameSorter {
    public static void main (String[] args) throws FileNotFoundException {

        int i = 0;
        ArrayList<String> data = null;
        try {
            File input = new File("C:\\Users\\geena\\IdeaProjects\\untitled1\\untitled1\\vandijk-cop3330\\vandijk-cop3330-assignment3\\src\\main\\java\\ex41\\exercise41_input.txt");
            Scanner reader = new Scanner(input);
            data = new ArrayList<String>();
            while (reader.hasNextLine()) {
                data.add(reader.nextLine());
                i++;
            }
            reader.close();

            Collections.sort(data);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        PrintWriter output = new PrintWriter("exercise41_output.txt");
        output.println("Total of " + (i) + " names\n-----------------");

        for (int j = 0; j < i; j++)
            output.println(data.get(j));

        output.close();
    }
}
