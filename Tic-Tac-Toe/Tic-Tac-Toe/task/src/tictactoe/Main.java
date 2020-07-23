package tictactoe;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static boolean done = false;
    static boolean move = false; // false is 'X', true is 'O'
    public static void main(String[] args) {
        /*System.out.println("Enter cells: ");
        String request = scanner.next();
        scanner.nextLine();
        char[][] field = new char[3][3];
        int k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                field[i][j] = request.charAt(k);
                k++;
            }
        }
        */
        char[][] field = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                field[i][j] = ' ';
            }
        }
        while (!done) {
            printField(field);
            field = checkCoordinates(field);
        }
    }

    private static char[][] checkCoordinates(char[][] field) {
        System.out.println("Enter the coordinates: ");
        String line = scanner.nextLine();
        if (line.length() > 2 && Character.isDigit(line.charAt(0)) && (Character.isDigit(line.charAt(2)))) {
            int x = Character.getNumericValue(line.charAt(0)) - 1;
            int y = -1, y0 = Character.getNumericValue(line.charAt(2));
            if (y0 == 1) y = 2;
            if (y0 == 2) y = 1;
            if (y0 == 3) y = 0;
            if (x > -1 && x < 3 && y > -1) {
                if (field[y][x] == ' ') {
                    if (!move) {
                        field[y][x] = 'X';
                        move = true;
                        check(field);
                    } else {
                        field[y][x] = 'O';
                        move = false;
                        check(field);
                    }
                } else {
                    if ((field[y][x] == 'X') || (field[y][x] == 'O')) {
                        System.out.println("This cell is occupied! Choose another one!");
                        checkCoordinates(field);
                    }
                }
            } else {
                System.out.println("Coordinates should be from 1 to 3!");
                checkCoordinates(field);
            }
        } else {
            System.out.println("You should enter numbers!");
            checkCoordinates(field);
        }
        return field;
    }

    public static void printField(char[][] field) {
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 0) System.out.print("| ");
                System.out.print(field[i][j] + " ");
                if (j == 2) System.out.println("|");
            }
        }
        System.out.println("---------");
    }

    public static void check(char[][] field) {
        int[] line = new int[9];
        boolean zero = false;
        int k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field[i][j] == ' ') {
                    line[k] = 0;
                    zero = true;
                }
                if (field[i][j] == 'X') line[k] = 1;
                if (field[i][j] == 'O') line[k] = -1;
                k++;
            }
        }
        if ((Arrays.stream(line).sum() > 1) || (Arrays.stream(line).sum() < -1)) {
            System.out.println("Impossible");
            done = true;
        }
        if ((winStrategy(line, -1)) && (winStrategy(line, 1)) && (!done)) {
            System.out.println("Impossible");
            done = true;
        }
        if (winStrategy(line, -1) && (!done)) {
            printField(field);
            System.out.println("O wins");
            done = true;
        }
        if (winStrategy(line, 1) && (!done)) {
            printField(field);
            System.out.println("X wins");
            done = true;
        }
        if ((!winStrategy(line, -1)) && (!winStrategy(line, 1)) && (!zero) && (!done)) {
            printField(field);
            System.out.println("Draw");
            done = true;
        }
        //if ((zero) && (!done)) System.out.println("Game not finished");
    }

    public static boolean winStrategy(int[] line, int num) {
        if (num == line[0] && num == line[1] && num == line[2]) return true;
        if (num == line[3] && num == line[4] && num == line[5]) return true;
        if (num == line[6] && num == line[7] && num == line[8]) return true;
        if (num == line[0] && num == line[3] && num == line[6]) return true;
        if (num == line[1] && num == line[4] && num == line[7]) return true;
        if (num == line[2] && num == line[5] && num == line[8]) return true;
        if (num == line[0] && num == line[4] && num == line[8]) return true;
        if (num == line[2] && num == line[4] && num == line[6]) return true;
        return false;

    }
}