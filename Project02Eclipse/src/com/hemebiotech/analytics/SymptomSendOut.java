package com.hemebiotech.analytics;


import com.hemebiotech.analytics.exception.OutputFileException;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

/** SymptomSendOut
 * write  keys and values of symptomTab to a outfile OUT_PUT;
 */
public class SymptomSendOut {

    private static final String OUTPUT_FILE = "Symptom.out";

    /**
     * ceation Filewriter symptomOut,
     * symptomTab keys and values in Set listKeys,
     * for each keys in listKey :
     * write keys and values in symptomOut
     * @param symptomTab
     * @throws OutputFileException
     */
    public void sendOut (Map<String, Integer> symptomTab) throws OutputFileException {
        FileWriter symptomOut;
        try {
            symptomOut = new FileWriter(OUTPUT_FILE);
            Set<String> listKeys = symptomTab.keySet();
            for (String key : listKeys) {
                symptomOut.write(key + " : " + symptomTab.get(key) + "\n");
            }
            symptomOut.close();
        } catch (IOException e) {
            throw new OutputFileException("Impossible to write to " + OUTPUT_FILE);
        }
    }
}



