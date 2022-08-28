public class Task_5 {
    public static void main(String[] args)
    {
        int[][] matrixBefore = {
                {-5,1,0},
                {4,3,1},
                {-2,8,-1}
        };
        System.out.println("Матриця до:  ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%3d", matrixBefore[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = i+1; j < 3; j++) {
                int temp = matrixBefore[i][j];
                matrixBefore[i][j] = matrixBefore[j][i];
                matrixBefore[j][i] = temp;
            }
        }

        System.out.println("Матриця після:  ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%3d", matrixBefore[i][j]);
            }
            System.out.println();
        }
    }
}