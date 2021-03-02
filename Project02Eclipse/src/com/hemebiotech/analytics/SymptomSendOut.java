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

        public void sendOut (String OUTPUT_FILE, Map<String, Integer> symptomTab)  {

            FileWriter symptomOut;

            try {
                symptomOut = new FileWriter(OUTPUT_FILE);

                Set<String> listKeys = symptomTab.keySet();

                for (String key : listKeys) {

                    symptomOut.write(key + " : " + symptomTab.get(key) + "\n");

                }
                symptomOut.close();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("symptom out file error");
            }
        }
    }



