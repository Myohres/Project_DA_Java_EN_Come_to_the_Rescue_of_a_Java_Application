package com.hemebiotech.analytics;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

    /** SymptomSendOut
     * write  keys and values of symptomTab to a outfile OUT_PUT;
     *
     *
     *
     */

    public class SymptomSendOut {

        public static void sendOut (String OUTPUT_FILE, Map<String, Integer> symptomTab)  {

            FileWriter symptomOut = null;
            try {
                symptomOut = new FileWriter(OUTPUT_FILE);
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("File Symptom.out error");
            }

            Set listKeys = symptomTab.keySet();

            for (Object key : listKeys) {
                try {
                    assert symptomOut != null;
                    symptomOut.write(key + " : " + symptomTab.get(key) + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("Error writing board to file.out");
                }
            }

            try {
                assert symptomOut != null;
                symptomOut.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }



