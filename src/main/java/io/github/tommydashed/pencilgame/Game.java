package io.github.tommydashed.pencilgame;
import java.util.Scanner;

public class Game {

    private final Scanner scanner = new Scanner(System.in);

    public void run() {
        int pencils = readPencilCount(); //get pencil count input and store value in var
        String first = readPlayerName(); // get player name input and store in var

        // print pencils, will extract to its own method later
        for (int i = 0; i < pencils; i++) {
            System.out.print("|");

        }

        // print a new line then print line with string
        System.out.println();
        System.out.println(first + " is going first!");
    }

    // read the pencil count and validate the input
    private int readPencilCount() {
        System.out.println("How many pencils would you like to use:");
        while (true) {
            String line = scanner.nextLine().trim();
            int count;
            try {
                count = Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number:");
                continue;
            }
            if (count <= 0) {
                System.out.println("Please enter a number greater than 0:");
                continue;
            }
            return count;
        }
    }

    private String readPlayerName() {
        System.out.println("Who will be first player:");
        return scanner.nextLine().trim();
    }
}