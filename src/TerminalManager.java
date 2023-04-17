import java.io.IOException;
import java.util.Scanner;

public class TerminalManager {
    private static TerminalState currentState = new HomePageState();

    public static void setCurrentState(TerminalState newState) {
        currentState = newState;
    }
    public static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (IOException | InterruptedException ex) {
            System.err.println("Failed to clear console.");
        }
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