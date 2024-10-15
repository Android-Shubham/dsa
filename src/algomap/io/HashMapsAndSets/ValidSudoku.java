package algomap.io.HashMapsAndSets;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {



    public boolean isValidSudoku(char[][] board) {

        // rows
        for (int i = 0; i < 9; i++) {
            int[] map = new int[10];
            for (int j = 0; j < 9; j++) {
                char ch = board[i][j];
                if (ch != '.') {
                    if (map[ch - '0'] == 1) {
                        return false;
                    }
                    map[ch - '0']++;
                }

            }
        }

        // column
        for (int i = 0; i < 9; i++) {
            int[] map = new int[10];
            for (int j = 0; j < 9; j++) {
                char ch = board[j][i];
                if (ch != '.') {
                    if (map[ch - '0'] == 1) {
                        return false;
                    }
                    map[ch - '0']++;
                }
            }
        }

        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                int[] map = new int[10];
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        char ch = board[k][l];
                        if (ch != '.') {
                            if (map[ch - '0'] == 1) {
                                return false;
                            }
                            map[ch - '0']++;
                        }
                    }
                }

            }
        }

        return true;
    }

    public boolean isValidSudoku_set(char[][] board) {

        // rows
        for (int i = 0; i < 9; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char ch = board[i][j];
                if (ch != '.') {
                    if (set.contains(ch)) {
                        return false;
                    }
                    set.add(ch);
                }
            }
        }

        // column
        for (int i = 0; i < 9; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char ch = board[j][i];
                if (ch != '.') {
                    if (set.contains(ch)) {
                        return false;
                    }
                    set.add(ch);
                }
            }
        }

        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                Set<Character> set = new HashSet<>();
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        char ch = board[k][l];
                        if (ch != '.') {
                            if (set.contains(ch)) {
                                return false;
                            }
                            set.add(ch);
                        }
                    }
                }

            }
        }

        return true;
    }

}
