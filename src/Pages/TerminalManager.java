package Pages;

import java.util.Scanner;

public class TerminalManager {
    private static TerminalState currentState = new HomePageState();

    public static void setCurrentState(TerminalState newState) {
        currentState = newState;
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            currentState.displayCurrentPage();

            System.out.println("Enter a command:");
            String input = scanner.nextLine();

            currentState.handleInput(input);
        }
    }
}