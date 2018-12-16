
class Sudoku{
    public static void sudo(String[] args){
        boolean jo = false;
        boolean  jo1 = false;
        int row= 9, col = 9;
        int[] t = {0};
        int[] t1 = {0};
        Integer[][] matrix = new Integer[row][col];

        for(int i = 1; i <= row; i++)
            for(int j = 1; j <= col; j++)
                t[matrix[i][j]]++;

            for(int i = 1; i <= 9; i++)
                if(t[i] == 9)
                    jo = true;

                if (jo){
                    for(int i = 1; i <= row; i++)
                        for(int j = 1; j <= col; j++)
                            t1[matrix[j][i]]++;

                    for(int i = 1; i <= 9; i++)
                        if(t1[i] == 9)
                            jo1 = true;
                }

                if(jo && jo1)
                    System.out.println("Correct!");
                    else
                    System.out.println("Unfortunetally this isn't correct :(");

    }
}