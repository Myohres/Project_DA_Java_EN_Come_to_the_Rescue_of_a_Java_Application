package com.hemebiotech.analytics;

import java.io.*;
import java.util.*;

public class SymptomAnalysis {

    public static final String INPUT_FILE = "symptoms.txt";
    public static final String OUTPUT_FILE = "Symptom.out";




    public static void main(String[] Args) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader(INPUT_FILE));
            System.out.println("file " +INPUT_FILE + " read");

            Map<String, Integer> symptomTab = SymptomOrder.symptomTab(reader); // board with symptoms counted and indexed
            System.out.println("Board symptomTab created");

            SymptomSendOut.sendOut(OUTPUT_FILE,symptomTab); // exportation of board to Symptom.out
            System.out.println("Board symptomTab sent");
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }

    }


}