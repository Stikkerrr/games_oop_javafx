package ru.job4j.puzzle;

/**
 * Checks the winning combination after the player's move.
 */
public class Win {
	
	/**
	 * The method checks for the presence of at least one row or column with a winning combination.
	 *
	 * @param board two-dimensional array wherein will be a search for the winning combination
	 */
	public static boolean check(int[][] board) {
		for (int i = 0; i < board.length; i++) {
			if (rowCheck(board[i]) || colCheck(i, board)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Method validating a row.
	 *
	 * @param row horizontal array to check
	 */
	private static boolean rowCheck(int[] row) {
		for (int value : row) {
			if (value != 1) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Method validating a column.
	 *
	 * @param indexCol the cell index in horizontal arrays that forms the vertical array
	 * @param board    two-dimensional array to find a column of identical values
	 */
	private static boolean colCheck(int indexCol, int[][] board) {
		for (int[] ints : board) {
			if (ints[indexCol] != 1) {
				return false;
			}
		}
		return true;
	}
}
