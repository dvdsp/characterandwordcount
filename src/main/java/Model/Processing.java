/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 *
 * @author QuaVi
 */


public class Processing {
    private Map<Character, Integer> charCounter = new HashMap<>();
    private Map<String, Integer> wordCounter = new HashMap<>();

    public void analyzeCharacters(String content) {
        charCounter.clear(); 
        for (char ch : content.toCharArray()) {
         if (Character.isSpaceChar(ch)) 
                continue;
            if (!charCounter.containsKey(ch)) {
                charCounter.put(ch, 1);
            } else {
                charCounter.put(ch, ((int) charCounter.get(ch)) + 1);
            }
        

        }
    }

    public void analyzeWords(String content) {
        wordCounter.clear(); 

        StringTokenizer tokenizer = new StringTokenizer(content);
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            if (!wordCounter.containsKey(token)) {
                wordCounter.put(token, 1);
            } else {
                wordCounter.put(token, ((int) wordCounter.get(token)) + 1);
            }
        }
    }

    public Map<Character, Integer> getCharCounter() {
        return charCounter;
    }

    public Map<String, Integer> getWordCounter() {
        return wordCounter;
    }
}



