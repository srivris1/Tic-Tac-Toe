/**
 * TicTacToe
 * UC8 controls the continuous game loop and alternates
 * turns until the game ends.
 */
public class uc8 {

    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    static char humanSymbol = 'X';
    static char computerSymbol = 'O';

    /**
     * Entry point of the program. Demonstrates the structure
     * of a continuous game loop.
     */
    public static void main(String[] args) {

        while (!gameOver) {

            printBoard();

            if (isHumanTurn) {
                System.out.println("Human's turn (X):");
                humanMove();
            } else {
                System.out.println("Computer's turn (O):");
                computerMove();
            }

            // Check win or draw after each move
            if (checkWin()) {
                printBoard();
                if (isHumanTurn) {
                    System.out.println("Human wins!");
                } else {
                    System.out.println("Computer wins!");
                }
                gameOver = true;

            } else if (checkDraw()) {
                printBoard();
                System.out.println("It's a draw!");
                gameOver = true;

            } else {
                // Switch turn
                isHumanTurn = !isHumanTurn;
            }
        }
    }

    // Print the current board
    static void printBoard() {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Placeholder — replace with UC5 human input logic
    static void humanMove() {
        // UC5 logic goes here
    }

    // Placeholder — replace with UC7 computer random move logic
    static void computerMove() {
        // UC7 logic goes here
    }

    // Placeholder — replace with UC3 win-check logic
    static boolean checkWin() {
        return false; // UC3 logic goes here
    }

    // Placeholder — replace with UC4 draw-check logic
    static boolean checkDraw() {
        return false; // UC4 logic goes here
    }
}