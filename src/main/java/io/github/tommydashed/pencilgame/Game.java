package io.github.tommydashed.pencilgame;
import java.util.Scanner;

public class Game {

    private final Scanner scanner = new Scanner(System.in);

    public void run() {
        int pencils = readPencilCount(); //get pencil count and store value in var
        String first = "Jacob"; // store placeholder name for now

        // print pencils, will extract to its own method later
        for (int i = 0; i < pencils; i++) {
            System.out.print("|");

        }

        // print a new line then print line with string
        System.out.println();
        System.out.println(first + " is going first!");
    }
        // read the pencil count
    private int readPencilCount() {
        System.out.println("How many pencils would you like to use:");
        String line = scanner.nextLine().trim();
        return Integer.parseInt(line);
        }
    }