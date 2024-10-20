package com.pluralsight;

import com.pluralsight.Utils.Console;

public class MainScreen {
    public static void main(String[] args) {
        MainScreen mainScreen = new MainScreen();
        ProductScreen productScreen = new ProductScreen();
        CartScreen cartScreen = new CartScreen();
        char userSelection = 0;


        // Main Loop
        do {
            try {
                userSelection = mainScreen.displayOptions();
                switch (userSelection) {
                    case 'P':
                    case 'C':
                    case 'G':
                }
            }
            catch (IllegalArgumentException e) {
                System.out.println("command not found");
            }

        } while (userSelection != 'X');
    }


    /**
     * Main menu's options
     * @return Char of user's option
     */
    public char displayOptions() throws IllegalArgumentException {
        String options = """
                Welcome to UNNAMED STORE! Please select from the following choices:
                \tDisplay [P]roducts
                \tDisplay [C]art
                \tDisplay [G]UI
                \tExit    [X]
                Enter Command:\s""";
        String selection;

        do {
            selection = Console.PromptForString(options);
        } while (selection.isEmpty());

        return switch (selection.toUpperCase()) { // New way to do a switch statement!
            case "P" -> 'P';
            case "C" -> 'C';
            case "G" -> 'G';
            case "X", "EXIT", "E", "Q", "QUIT" -> 'X';
            default -> throw new IllegalArgumentException("Invalid selection: " + selection);
        };

    }
}
