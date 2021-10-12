/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Geena-Maria van Dijk
 */

package ex45;

import java.io.*;
import java.util.Scanner;

public class WordFinder {

    public static void main(String[] args) throws IOException {

        File infile = new File("C:\\Users\\geena\\IdeaProjects\\untitled1\\untitled1\\vandijk-cop3330\\vandijk-cop3330-assignment3\\src\\main\\java\\ex45\\exercise45_input.txt");
        Scanner fileInput = new Scanner(infile);

        Scanner input = new Scanner(System.in);
        String output;

        System.out.println("What is the name of the output file? ");
        output = input.next();

        File outfile = new File("C:\\Users\\geena\\IdeaProjects\\untitled1\\untitled1\\vandijk-cop3330\\vandijk-cop3330-assignment3\\src\\main\\java\\ex45\\" + output + ".txt");

        BufferedWriter out = new BufferedWriter(new FileWriter(outfile));

        while (fileInput.hasNext()) {
            String word = fileInput.nextLine();
            if (word.contains("utilize"))
                word = word.replace("utilize", "use");

            out.write(word);
        }
        out.close();

    }

}

