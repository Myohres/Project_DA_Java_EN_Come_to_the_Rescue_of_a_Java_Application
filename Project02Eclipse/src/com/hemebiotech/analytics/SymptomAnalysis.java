package com.hemebiotech.analytics;

import java.io.*;
import java.util.*;

public class SymptomAnalysis {

    public static final String INPUT_FILE = "Project02Eclipse/symptoms.txt";
    public static final String OUTPUT_FILE = "Symptom.out";




    public static void main(String[] Args) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader(INPUT_FILE));

            Map<String, Integer> symptomTab = SymptomOrder.symptomTab(reader); // tableau contenant les symptoms comptés et triés

            SymptomSendOut.sendOut(OUTPUT_FILE,symptomTab); // exportation du tableau sur fichier.out
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }


}