package Utilities;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class InputHandling {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getInput() {
        String inputString = null;
        do {
            try {
                System.out.print("Enter input -> ");
                inputString = scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input. Try again.");
                scanner.nextLine(); // Clear the invalid input
                continue;
            } catch (NoSuchElementException e) {
                System.out.println("No input detected. Try Again.");
                continue;
            } catch (Exception e) {
                System.out.println("Unexpected Error: Printing Trace...");
                e.printStackTrace();
                continue;
            }
            break;
        } while (true);
        return inputString;
    }

    public static String getInput(String prompt) {
        String inputString = null;
        System.out.println(prompt);
        do {
            try {
                System.out.print("Enter input -> ");
                inputString = scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input. Try again.");
                scanner.nextLine(); // Clear the invalid input
                continue;
            } catch (NoSuchElementException e) {
                System.out.println("No input detected. Try Again.");
                continue;
            } catch (Exception e) {
                System.out.println("Unexpected Error: Printing Trace...");
                e.printStackTrace();
                continue;
            }
            break;
        } while (true);
        return inputString;
    }

    public static int getIntInput(String prompt) {
        String inputString = null;
        int inputInt = 0;
        System.out.println(prompt);
        do {
            try {
                System.out.print("Enter input -> ");
                inputString = scanner.nextLine();
                inputInt = Integer.parseInt(inputString);
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input. Try again.");
                scanner.nextLine(); // Clear the invalid input
                continue;
            } catch (NoSuchElementException e) {
                System.out.println("No input detected. Try Again.");
                continue;
            } catch (Exception e) {
                System.out.println("Unexpected Error: Printing Trace...");
                e.printStackTrace();
                continue;
            }
            break;
        } while (true);
        return inputInt;
    }

    public static int getIntInput() {
        String inputString = null;
        int inputInt = 0;
//        System.out.println(prompt);
        do {
            try {
                System.out.print("Enter input -> ");
                inputString = scanner.nextLine();
                inputInt = Integer.parseInt(inputString);
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input. Try again.");
                scanner.nextLine(); // Clear the invalid input
                continue;
            } catch (NoSuchElementException e) {
                System.out.println("No input detected. Try Again.");
                continue;
            } catch (Exception e) {
                System.out.println("Unexpected Error: Printing Trace...");
                e.printStackTrace();
                continue;
            }
            break;
        } while (true);
        return inputInt;
    }

    // TODO: 2023-10-17 Add validation handling to getNameInput, getEmailInput(), and getPhoneNumberInput()
    public static String getNameInput() {
        return getInput("Please enter your full name. (Eg. John Smith)");
    }
    public static String getEmailInput() {
        return getInput("Please enter your Email. (Eg. johnsmith@example.com)");
    }
    public static String getPhoneNumberInput() {
        return getInput("Please enter your phone number. (Eg. 1234567890)");
    }
}
