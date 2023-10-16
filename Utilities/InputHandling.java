package Utilities;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class InputHandling {
    private static final Scanner scanner = new Scanner(System.in);
    public String getInput() {
        String inputString;
        do {
            try {
                System.out.println("Enter input -> ");
                inputString = scanner.nextLine();
            } catch (NoSuchElementException e) {
                System.out.println("Must enter valid input. Try again.");

                continue;
            }
            break;
        } while (true);
        return inputString;
    }
}
