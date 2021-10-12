/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Geena-Maria van Dijk
 */


package ex44;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ProductSearch {

    static public void main (String[] args ) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\geena\\IdeaProjects\\untitled1\\untitled1\\vandijk-cop3330\\vandijk-cop3330-assignment3\\src\\main\\java\\ex44\\exercise44_input.json"));

        Gson obj = new Gson();

        ArrayInput arr= obj.fromJson(br, ArrayInput.class);



        Scanner input = new Scanner(System.in);


        String userInput;
        boolean flag = true;
        int i;

        while (flag){

            System.out.printf("What is the product name?");
            userInput = input.nextLine();

            for (i = 0; i < arr.products.size(); i++){
                if (userInput.equals(arr.products.get(i).name)){
                    System.out.println(arr.products.get(i));
                    flag = false;
                    break;
                }
            }


            if (i == arr.products.size())
                System.out.printf("Sorry, that product was not found in our inventory.\n");

        }
        br.close();


    }
}

