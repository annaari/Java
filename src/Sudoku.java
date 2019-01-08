
class Sudoku {
    void sudo() {
        boolean jo = false;
        boolean jo1 = false;
        int row = 9, col = 9;
        int[] sor = new int[10];
        int[] oszlop = new int[10];
        for (int i = 1; i <= 9; i++) {
            sor[i] = 0;
            oszlop[i] = 0;
        }
        int[][] matrix = new int[row][col];

        for (int i = 1; i <= row; i++)
            for (int j = 1; j <= col; j++)
                sor[matrix[i][j]]++;

        for (int i = 1; i <= 9; i++)
            if (sor[i] == 9)
                jo = true;

        if (jo) {
            for (int i = 1; i <= row; i++)
                for (int j = 1; j <= col; j++)
                    oszlop[matrix[j][i]]++;

            for (int i = 1; i <= 9; i++)
                if (oszlop[i] == 9)
                    jo1 = true;
        }

        if (jo && jo1)
            System.out.println("Correct!");
        else
            System.out.println("Unfortunetally this isn't correct :(");

    }
}