package tictactoe;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String grid = scanner.next();
        char[][] array = new char[3][3];
        int counter = 0;

        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                array[i][j] = grid.charAt(counter);
                counter++;
                System.out.print(array[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");

        checkScore(array);
    }

    public static void checkScore(char[][] array) {
        int xCount = 0;
        int oCount = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] == 'X') {
                    xCount++;
                }
                else if (array[i][j] == 'O') {
                    oCount++;
                }
            }
        }
        boolean emptyCells = xCount + oCount != 9;
        boolean xWins = false;
        boolean oWins = false;

        if (array[0][0] == 'X' && array[0][1] == 'X' && array[0][2] == 'X') {
            xWins = true;
        } else if (array[1][0] == 'X' && array[1][1] == 'X' && array[1][2] == 'X') {
            xWins = true;
        } else if (array[2][0] == 'X' && array[2][1] == 'X' && array[2][2] == 'X') {
            xWins = true;
        } else if (array[0][0] == 'X' && array[1][0] == 'X' && array[2][0] == 'X') {
            xWins = true;
        } else if (array[0][1] == 'X' && array[1][1] == 'X' && array[2][1] == 'X') {
            xWins = true;
        } else if (array[0][2] == 'X' && array[1][2] == 'X' && array[2][2] == 'X') {
            xWins = true;
        } else if (array[0][2] == 'X' && array[1][1] == 'X' && array[2][0] == 'X') {
            xWins = true;
        } else if (array[0][0] == 'X' && array[1][1] == 'X' && array[2][2] == 'X') {
            xWins = true;
        }

        if (array[0][0] == 'O' && array[0][1] == 'O' && array[0][2] == 'O') {
            oWins = true;
        } else if (array[1][0] == 'O' && array[1][1] == 'O' && array[1][2] == 'O') {
            oWins = true;
        } else if (array[2][0] == 'O' && array[2][1] == 'O' && array[2][2] == 'O') {
            oWins = true;
        } else if (array[0][0] == 'O' && array[1][0] == 'O' && array[2][0] == 'O') {
            oWins = true;
        } else if (array[0][1] == 'O' && array[1][1] == 'O' && array[2][1] == 'O') {
            oWins = true;
        } else if (array[0][2] == 'O' && array[1][2] == 'O' && array[2][2] == 'O') {
            oWins = true;
        } else if (array[0][2] == 'O' && array[1][1] == 'O' && array[2][0] == 'O') {
            oWins = true;
        } else if (array[0][0] == 'O' && array[1][1] == 'O' && array[2][2] == 'O') {
            oWins = true;
        }

        if (oWins && xWins || xCount - oCount > 1 || oCount - xCount > 1) {
            System.out.println("Impossible");
        } else if (!oWins && !xWins && emptyCells) {
            System.out.println("Game not finished");
        } else if (oWins) {
            System.out.println("O wins");
        } else if (xWins) {
            System.out.println("X wins");
        } else {
            System.out.println("Draw");
        }
    }

}
