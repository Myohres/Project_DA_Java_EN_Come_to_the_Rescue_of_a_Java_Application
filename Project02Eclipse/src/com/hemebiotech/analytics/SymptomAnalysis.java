package com.hemebiotech.analytics;


import com.hemebiotech.analytics.exception.InputFileException;
import com.hemebiotech.analytics.exception.OutputFileException;

import java.util.*;

/**
 * Generate a symptoms list output file from a symptom.txt file
 * Symptoms are count and classify alphabetically
 */
public class SymptomAnalysis {

    public static void main(String[] Args)  {
        try {
            Map<String, Integer> symptomTab = new SymptomOrder().symptomTab(); // board with symptoms counted and indexed
            new SymptomSendOut().sendOut(symptomTab); // exportation of board to Symptom.out
        } catch (InputFileException | OutputFileException e) {
            System.err.println(e.getMessage()); // reading or writing error message
        }
    }
}