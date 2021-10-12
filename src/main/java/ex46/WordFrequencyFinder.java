package ex46;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordFrequencyFinder {
    static public void main (String[] args) throws FileNotFoundException {

        File infile = new File("C:\\Users\\geena\\IdeaProjects\\untitled1\\untitled1\\vandijk-cop3330\\vandijk-cop3330-assignment3\\src\\main\\java\\ex46\\exercise46_input.txt");
        Scanner scanner = new Scanner (infile);

        HashMap<String,String> map = new HashMap<>();
        while (scanner.hasNext()){
            String word = scanner.next();

            if (map.containsKey(word)){
                String count = map.get(word) + "*";
                map.put (word,count);
            }
            else {
                String count = "*";
                map.put(word,count);
            }
        }

        scanner.close();

        TreeMap<String, String> sorted = new TreeMap<>();
        sorted.putAll(map);



        for (Map.Entry<String, String> entry: sorted.entrySet()){
                System.out.printf("%20s",entry.getKey()+ " : ");
                System.out.printf("%-20s\n",entry.getValue());
        }


    }
}
