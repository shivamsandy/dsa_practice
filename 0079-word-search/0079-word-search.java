class Solution {
    public boolean exist(char[][] board, String word) {

        // easy hai BUT LENDI HAI DMG KHRAB HO GYA 
        
        int r = board.length;
        int c = board[0].length;
        // int word_index=0;

        boolean found = false;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                char ch = word.charAt(0);
                if (ch == board[i][j]) {
                    found = word_search(board, i, j, word, 0);

                    if (found) {
                        break;
                    }
                }

            }
            if (found) {
                break;
            }
            // System.out.println();
        }

        return found;

        
    }  // INTERSTING  QUESTION HAI 
     public static boolean word_search(char[][] board, int row, int col, String word, int word_index) {
        int r = board.length;
        int c = board[0].length;

        if (word_index == word.length()) { // valid case
            return true;
        }
        if (row < 0 || col < 0 || row >= r || col >= c) { // INVALID CASE
            return false;
        }
        if (  board[row][col] == '$' || board[row][col] != word.charAt(word_index)) { // INVALID CASE
            return false;
        }
        // marked as visited
        char ch = board[row][col];
        board[row][col] = '$';

        // DFS CALLS

        boolean found = (word_search(board, row + 1, col, word, word_index + 1) ||
                word_search(board, row, col - 1, word, word_index + 1) ||
                word_search(board, row - 1, col, word, word_index + 1) ||
                word_search(board, row, col + 1, word, word_index + 1)

        );

        // BACKTRACKING
        board[row][col] = ch;

        return found;
    }
}