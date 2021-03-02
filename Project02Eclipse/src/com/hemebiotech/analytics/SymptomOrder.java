package com.hemebiotech.analytics;

import com.hemebiotech.analytics.exception.InputFileException;

import java.io.IOException;
import java.io.*;
import java.util.*;

/** SymptomOrder
 * count and classify alphabetically symptoms from file Symptoms.txt in reader
 */
public class SymptomOrder {

    private static final String INPUT_FILE = "symptoms.txt";

    /**
     * creation treemap,
     * key = symptom,
     * value = symptom iteration,
     * For each bufferreader reader line :
     * if symptom (key) is not present new entrance to Treemap with key = line and value=1,
     * if symtpom (key) already present +1 to Treemap key value
     * @return Treemap symptomTab
     * @throws InputFileException Input file is not read
     */
    public  Map<String, Integer> symptomTab() throws InputFileException {

        BufferedReader reader;
        Map<String, Integer> symptomTab = new TreeMap<>();
        try {
            reader = new BufferedReader(new FileReader(INPUT_FILE));
            String line;
            while ((line=reader.readLine())!= null)
            {
                if (!symptomTab.containsKey(line)) {
                    symptomTab.put(line, 1);
                } else {
                    symptomTab.put(line, symptomTab.get(line) + 1);
                }
            }
        } catch (IOException e) {
            throw new InputFileException("File " + INPUT_FILE + " is impossible to read");
        }
        return symptomTab;
    }
}
