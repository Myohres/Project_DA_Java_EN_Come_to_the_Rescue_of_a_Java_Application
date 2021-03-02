package com.hemebiotech.analytics;


import java.util.*;

public class SymptomAnalysis {


    public  static final String OUTPUT_FILE = "Symptom.out";


    public static void main(String[] Args)  {

        Map<String, Integer> symptomTab = new SymptomOrder().symptomTab(); // board with symptoms counted and indexed

        new SymptomSendOut().sendOut(OUTPUT_FILE, symptomTab); // exportation of board to Symptom.out

    }
}