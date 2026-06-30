import java.util.Scanner;

public class TicTacToeAI {
    static char[] board = {'1','2','3','4','5','6','7','8','9'};

    static void printBoard() {
        System.out.println();
        System.out.println(board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("--+---+--");
        System.out.println(board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("--+---+--");
        System.out.println(board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    static boolean isMovesLeft() {
        for (char c : board)
            if (c != 'X' && c != 'O')
                return true;
        return false;
    }

    static int evaluate() {
        int[][] win = {
            {0,1,2},{3,4,5},{6,7,8},
            {0,3,6},{1,4,7},{2,5,8},
            {0,4,8},{2,4,6}
        };

        for (int[] w : win) {
            if (board[w[0]] == board[w[1]] && board[w[1]] == board[w[2]]) {
                if (board[w[0]] == 'O') return 10;
                if (board[w[0]] == 'X') return -10;
            }
        }
        return 0;
    }

    static int minimax(boolean isMax) {
        int score = evaluate();

        if (score == 10 || score == -10)
            return score;

        if (!isMovesLeft())
            return 0;

        if (isMax) {
            int best = -1000;
            for (int i = 0; i < 9; i++) {
                if (board[i] != 'X' && board[i] != 'O') {
                    char temp = board[i];
                    board[i] = 'O';
                    best = Math.max(best, minimax(false));
                    board[i] = temp;
                }
            }
            return best;
        } else {
            int best = 1000;
            for (int i = 0; i < 9; i++) {
                if (board[i] != 'X' && board[i] != 'O') {
                    char temp = board[i];
                    board[i] = 'X';
                    best = Math.min(best, minimax(true));
                    board[i] = temp;
                }
            }
            return best;
        }
    }

    static void aiMove() {
        int bestVal = -1000;
        int bestMove = -1;

        for (int i = 0; i < 9; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                char temp = board[i];
                board[i] = 'O';
                int moveVal = minimax(false);
                board[i] = temp;

                if (moveVal > bestVal) {
                    bestMove = i;
                    bestVal = moveVal;
                }
            }
        }
        board[bestMove] = 'O';
    }

    static boolean checkWinner(char player) {
        int[][] win = {
            {0,1,2},{3,4,5},{6,7,8},
            {0,3,6},{1,4,7},{2,5,8},
            {0,4,8},{2,4,6}
        };

        for (int[] w : win) {
            if (board[w[0]] == player &&
                board[w[1]] == player &&
                board[w[2]] == player)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            printBoard();

            System.out.print("Enter your move (1-9): ");
            int move = sc.nextInt() - 1;

            if (move < 0 || move > 8 || board[move] == 'X' || board[move] == 'O') {
                System.out.println("Invalid move!");
                continue;
            }

            board[move] = 'X';

            if (checkWinner('X')) {
                printBoard();
                System.out.println("You Win!");
                break;
            }

            if (!isMovesLeft()) {
                printBoard();
                System.out.println("Draw!");
                break;
            }

            aiMove();

            if (checkWinner('O')) {
                printBoard();
                System.out.println("AI Wins!");
                break;
            }

            if (!isMovesLeft()) {
                printBoard();
                System.out.println("Draw!");
                break;
            }
        }

        sc.close();
    }
}
