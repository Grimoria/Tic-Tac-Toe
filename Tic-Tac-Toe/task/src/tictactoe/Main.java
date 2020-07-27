package tictactoe;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static char[] tictactoe = new char[9];
    static boolean oWin = false;
    static boolean xWin = false;
    static boolean isDraw = false;
    static boolean isImpossible = false;
    //Defaults to true to save time.
    static boolean isFinished = true;
    static boolean isXTurn = true;
    static int xAmount = 0;
    static int yAmount = 0;
    static int sum = 0;
    //There to maintain preexisting code.
    static boolean boardFromPreExistingInput = false;
    public static void main(String[] args) {
        // write your code here

        //Gets the input string to convert into a Tic Tac Toe board, if enabled.
        //Hardcoded at the minute, since the final phase of the program doesn't require it.
        if (boardFromPreExistingInput) {
            boardFromInput();
        } else {
            for (int i = 0; i < 9; i++) {
                //If scanner input is not enabled on this phase, just fill the array with dashes.
                tictactoe[i] = '_';
            }
        }

        //If there's a difference of two or more, somebody's cheating.
        //This nullifies all other analysis.
        if (xAmount - yAmount >= 2 || yAmount - xAmount >= 2) {
            isImpossible = true;
        }
        //Remakes initial input, just in case there were other characters in the initial input.
        String input = Arrays.toString(tictactoe);
        //Prints.
        System.out.println("Enter Cells: " + input);

        //Prints the board in JetBrains' expected format. Also checks game status.
        checkAndDrawBoard();

        boolean obtainedValidMove = false;
        while (scanner.hasNextLine() && (!xWin && !oWin && !isDraw)) {
            String baseString = scanner.nextLine();
            String[] toConvert = baseString.split(" ");
            int numX = Integer.parseInt(toConvert[0]);
            int numY = Integer.parseInt(toConvert[1]);
            System.out.println("Enter the coordinates: " + numX + " " + numY);
            boolean validMove = canMakeMove(numX, numY);
            if (validMove) {
                if (isXTurn) {
                    checkAndDrawBoard('X', numX, numY);
                    isXTurn = false;
                } else {
                    checkAndDrawBoard('O', numX, numY);
                    isXTurn = true;
                }
                obtainedValidMove = true;
            } else {
                System.out.println("Invalid Move. Input coordinates that correspond to an empty slot.");
            }
        }




        }


    //This method checks board status (except for impossibility.)
    //It also prints out the current state.
    public static void checkAndDrawBoard() {
        isFinished = true;
        System.out.println("---------");
        for (int i = 0; i < 9; i++) {
            //Prints game board.
            if (i == 0) {
                System.out.print("| ");
                System.out.print(tictactoe[i]);
                System.out.print(" ");
                sum += tictactoe[i];
                if (sum == 264) {
                    xWin = true;
                } else if (sum == 237) {
                    oWin = true;
                }
            } else if (i == 3 || i == 6) {
                System.out.println("|");
                System.out.print("| ");
                System.out.print(tictactoe[i]);
                System.out.print(" ");
                //reset and check
                sum = 0;
                sum += tictactoe[i];
                if (sum == 264) {
                    xWin = true;
                } else if (sum == 237) {
                    oWin = true;
                }

            } else if (i == 8) {
                System.out.print(tictactoe[i]);
                System.out.println(" |");
                //check
                sum += tictactoe[i];
                if (sum == 264) {
                    xWin = true;
                } else if (sum == 237) {
                    oWin = true;
                }
            } else {
                System.out.print(tictactoe[i]);
                System.out.print(" ");
                //check.
                sum += tictactoe[i];
                if (sum == 264) {
                    xWin = true;
                } else if (sum == 237) {
                    oWin = true;
                }
            }
            //Still a monolith, but less so than before.
            //Slightly less than the 4th stage variant, due to a bug exposed with test 8.
            //Had to add the horizontal test cases, which are supposed to be covered during the loop, here.
            if (((int) tictactoe[8] + tictactoe[4] + tictactoe[0]) == 264
                    || (int) tictactoe[2] + tictactoe[4] + tictactoe[6] == 264
                    || (int) tictactoe[0] + tictactoe[3] + tictactoe[6] == 264
                    || (int) tictactoe[1] + tictactoe[4] + tictactoe[7] == 264
                    || (int) tictactoe[2] + tictactoe[5] + tictactoe[8] == 264
                    || (int) tictactoe[0] + tictactoe[1] + tictactoe[2] == 264
                    || (int) tictactoe[3] + tictactoe[4] + tictactoe[5] == 264
                    || (int) tictactoe[6] + tictactoe[7] + tictactoe[8] == 264) {
                xWin = true;
            }
            if (((int) tictactoe[8] + tictactoe[4] + tictactoe[0]) == 237
                    || (int) tictactoe[2] + tictactoe[4] + tictactoe[6] == 237
                    || (int) tictactoe[0] + tictactoe[3] + tictactoe[6] == 237
                    || (int) tictactoe[1] + tictactoe[4] + tictactoe[7] == 237
                    || (int) tictactoe[2] + tictactoe[5] + tictactoe[8] == 237
                    || (int) tictactoe[0] + tictactoe[1] + tictactoe[2] == 237
                    || (int) tictactoe[3] + tictactoe[4] + tictactoe[5] == 237
                    || (int) tictactoe[6] + tictactoe[7] + tictactoe[8] == 237) {
                oWin = true;
            }

            if (xWin && oWin) {
                isImpossible = true;
            }
            //Checks game status, if I cannot perform it during the printing loop.
            if (tictactoe[i] == '_' && (!xWin && !oWin)) {
                isFinished = false;
            }

        }
        System.out.println("---------");
        //Prints out current game status, as reported by mechanisms earlier.
        if (isImpossible) {
            System.out.println("Impossible");
        } else if (xWin) {
            System.out.println("X wins");
        } else if (oWin) {
            System.out.println("O wins");
        } else if (!isFinished) {
            System.out.println("Game not finished");
        } else {
            System.out.println("Draw");
            isDraw = true;
        }
    }
    //Overfitting of checkAndDrawBoard to forcibly insert a character before drawing the board
    public static void checkAndDrawBoard(char insert, int x, int y) {
        switch (y) {
            case 1:
                tictactoe[(x - 1) + 6] = insert;
                checkAndDrawBoard();
                break;
            case 2:
                tictactoe[(x - 1) + 3] = insert;
                checkAndDrawBoard();
                break;
            case 3:
                tictactoe[x - 1] = insert;
                checkAndDrawBoard();
                break;
            default:
                //If you get that far, you broke the code somehow.
                throw new IllegalStateException("Unexpected value: " + y);
        }
    }

    //Checks if requested move can be made.
    public static boolean canMakeMove(int a, int b) {
        if ((a <= 3 && a >= 1) && (b <= 3 && b >= 1)) {
            switch (b) {
                case 1:
                    return tictactoe[(a - 1) + 6] == '_';
                case 2:
                    return tictactoe[(a - 1) + 3] == '_';
                case 3:
                    return tictactoe[a - 1] == '_';
                default:
                    //If you get that far, you broke the code somehow.
                    throw new IllegalStateException("Unexpected value: " + b);
            }

        } else return false;
    }

    public static void boardFromInput() {
        String character = scanner.nextLine();
        //Performs conversion. Also counts the amount of X and O.
        for (int i = 0; i < 9; i++) {
            if (character.charAt(i) == 'X' || character.charAt(i) == 'O' || character.charAt(i) == '_' ) {
                tictactoe[i] = character.charAt(i);
                if (character.charAt(i) == 'X') {
                    ++xAmount;
                } else if (character.charAt(i) == 'O') {
                    ++yAmount;
                }
            } else {
                tictactoe[i] = '_';
            }

        }
    }

}
