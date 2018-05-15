package com.sabre.intvw;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * This class counts the number of times a word occurs in a given string
 */
public class WordCount {
    public int countWords(BufferedReader br, String word2Find) {
        int wordCount=0;
        try {
            int c;
            while ((c=br.read()) != -1) {
                String currWord = "";
                char ch=(char)c;
                while (c != -1 && ch != ' ') {
                    currWord+=ch;
                    c = br.read();
                    ch=(char)c;
                }
                //System.out.println("Current word is "+currWord);
                if (currWord.equals(word2Find)) {
                    wordCount++;
                    System.out.println("The word "+word2Find+" occurs "+wordCount+" times.");
                }
           }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordCount;
    }
}
