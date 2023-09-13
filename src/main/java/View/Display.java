
package View;

import java.util.Map;



public class Display {
    public void displayCharacterResults(Map<Character, Integer> charCounter) {
        System.out.println("Character Count:");
        for (Map.Entry<Character, Integer> entry : charCounter.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public void displayWordResults(Map<String, Integer> wordCounter) {
        System.out.println("Word Count:");
        for (Map.Entry<String, Integer> entry : wordCounter.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}



