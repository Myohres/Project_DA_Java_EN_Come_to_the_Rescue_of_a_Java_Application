package com.hemebiotech.analytics;

import java.io.IOException;
import java.io.*;
import java.util.*;

/** SymptomOrder
 * Compter et classer alphabetiquement les symptoms du fichier Symptoms.txt contenu dans reader
 *
 * création d'un treemap
 * clé : un symptom
 * valeur : nombre d'itéaration du symptom
 *
 * Pour chaque ligne du bufferreader reader lue
 * si symptom (key) est nn présente, ajout d'une entré au Treemap ac ligne = key et valeur initialisé à 1
 * si symtpom (key déja présente on ajoute +1 à la valeur de la clé du tableau
 */


public class SymptomOrder {

    public static Map<String, Integer> symptomTab(BufferedReader reader){

        String line = "";
        Map<String, Integer> symptomTab = new TreeMap<>();

        while (true) {
            try {
                assert reader != null;
                if ((line = reader.readLine()) == null) break;
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("");
            }
            if (!symptomTab.containsKey(line)) {
                symptomTab.put(line, 1);

            } else {
                symptomTab.put(line, symptomTab.get(line) + 1);

            }
        }
        return symptomTab;
    }