package com.hemebiotech.analytics;


import com.hemebiotech.analytics.exception.InputFileException;
import com.hemebiotech.analytics.exception.OutputFileException;

import java.util.*;

public class SymptomAnalysis {

    public  static final String OUTPUT_FILE = "Symptom.out";

    public static void main(String[] Args)  {
        try {
            Map<String, Integer> symptomTab = new SymptomOrder().symptomTab(); // board with symptoms counted and indexed
            new SymptomSendOut().sendOut(OUTPUT_FILE, symptomTab); // exportation of board to Symptom.out
        } catch (InputFileException | OutputFileException e) {
            System.err.println(e.getMessage());
        }
    }
}