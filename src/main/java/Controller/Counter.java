
package Controller;

import View.Display;
import java.util.Scanner;



public class Counter {
    public static void run(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Model.Processing model = new Model.Processing();
        Display view = new Display();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Character Count");
            System.out.println("2. Word count");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter text....");
                    String content = scanner.nextLine();
                    model.analyzeCharacters(content);
                    view.displayCharacterResults(model.getCharCounter());
                }
                case 2 -> {
                    System.out.println("Enter text...");
                    String content2 = scanner.nextLine();
                    model.analyzeWords(content2);
                    view.displayWordResults(model.getWordCounter());
                }
                case 3 -> {
                    System.out.println("exit");
                    return;
                }
                default -> System.out.println("invalid choice.");
            }
        }
    }
}


