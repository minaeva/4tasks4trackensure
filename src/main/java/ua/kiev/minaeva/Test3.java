package ua.kiev.minaeva;

public class Test3 {

    public int test(String word1, String word2) {
        validateInput(word1, word2);

        int ox = word1.length();
        int oy = word2.length();
        int[][] d = fillFirstRowFirstColumn(ox, oy);

        for (int i = 1; i <= ox; i++) {
            for (int j = 1; j <= oy; j++) {
                int value1 = d[i - 1][j] + 1;
                int value2 = d[i][j - 1] + 1;
                int flag = (word1.charAt(i - 1) == word2.charAt(j - 1)) ? 0 : 1;
                int value3 = d[i - 1][j - 1] + flag;
                int result = Math.min(Math.min(value1, value2), value3);
                d[i][j] = result;
            }
        }

        return d[ox][oy];
    }

    private void printMatrix(int ox, int oy, int[][] d) {
        for (int i = 0; i <= ox; i++) {
            for (int j = 0; j <= oy; j++) {
                System.out.print(d[i][j]);
            }
            System.out.println();
        }
    }

    private int[][] fillFirstRowFirstColumn(int ox, int oy) {
        int[][] d = new int[ox + 1][oy + 1];
        for (int i = 0; i <= ox; i++) {
            d[i][0] = i;
        }
        for (int j = 1; j <= oy; j++) {
            d[0][j] = j;
        }
        return d;
    }

    private void validateInput(String word1, String word2) {
        if (word1 == null || word2 == null) {
            throw new RuntimeException("input word is null");
        }
    }

}
