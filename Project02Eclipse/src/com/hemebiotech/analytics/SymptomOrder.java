package com.hemebiotech.analytics;

import java.io.IOException;
import java.io.*;
import java.util.*;

/** SymptomOrder
 * to count and to classify alphabetically  symptoms from file Symptoms.txt in reader
 *
 * creation one treemap
 * key : one symptom
 * value : symptom number iteration
 *
 * For each bufferreader reader line :
 * if symptom (key) is not present, new entrance to Treemap with line = key and value=1
 * if symtpom (key) already present,  +1 to Treemap key value
 */


public class SymptomOrder {

    final static String INPUT_FILE = "symptoms.txt";

    public static Map<String, Integer> symptomTab() {

        BufferedReader reader;
        Map<String, Integer> symptomTab = new TreeMap<>();

        try {
            reader = new BufferedReader(new FileReader(INPUT_FILE));
            String line;

            while ((line=reader.readLine())!= null)
            {
                if (!symptomTab.containsKey(line)) {
                    symptomTab.put(line, 1);
                }
                else {
                    symptomTab.put(line, symptomTab.get(line) + 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(" input file reading error");
        }

        return symptomTab;
    }
}
