/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Geena-Maria van Dijk
 */


package ex43;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WebsiteGenerator {

    static public void main (String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);

        String siteName, author, js, css;

        System.out.printf("Site name: ");
        siteName = input.nextLine();
        System.out.printf("Author: ");
        author = input.nextLine();
        System.out.printf("Do you want a folder for JavaScript? ");
        js = input.nextLine();
        System.out.printf("Do you want a folder for CSS? ");
        css = input.nextLine();

        File directory = new File(String.format("./%s",siteName));
        directory.mkdir();

        System.out.printf("Created ./website/%s\n", siteName);

        PrintWriter website = new PrintWriter(String.format("./%s/index.html", siteName));

        website.println("<html>");
        website.println("<head>");
        website.println("<title> " + siteName +" </title>");
        website.println ("<meta name=\"author\" content=\"" + author+ "\"/>");
        website.println ("</head>");
        website.println ("<body>");
        website.println ("</body >");
        website.println ("</html>");
        website.close();



        System.out.printf("Created ./website/%s/index.html\n", siteName);



        if (js.compareTo("y") == 0){
            directory = new File(String.format("./%s/js", siteName));
            directory.mkdir();
            System.out.printf("Created ./website/%s/js/\n", siteName);
        }
        if (css.compareTo("y") == 0){
            directory = new File(String.format("./%s/css", siteName));
            directory.mkdir();
            System.out.printf("Created ./website/%s/css/\n", siteName);
        }


    }
}
