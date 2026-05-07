import java.util.Random;

/**
 * TicTacToe
 * UC7 allows the computer to make a random valid move
 * by reusing slot conversion and validation logic.
 */
public class uc7{

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };
    static char computerSymbol = 'O';

    /**
     * Entry point of the program. Triggers the computer move.
     */
    public static void main(String[] args) {
        computerMove();
    }

    /**
     * Generates random slot values until a valid move is found,
     * then places the computer symbol on the board.
     */
    static void computerMove() {
        Random random = new Random();
        int slot;
        int row, col;

        do {
            // Generate random slot between 1 and 9
            slot = random.nextInt(9) + 1;

            // Convert slot to row and col
            row = (slot - 1) / 3;
            col = (slot - 1) % 3;

        } while (board[row][col] != '-'); // Repeat if cell is already taken

        // Place the computer's symbol on the valid cell
        board[row][col] = computerSymbol;

        System.out.println("Computer placed at slot: " + slot);
    }
}