public class Task_5 {
    public static void main(String[] args)
    {
        int[][] matrix = new int[3][2];
        int[][] matrixT = new int[2][3];

        createMatrix(matrix);
        System.out.println("Matrix before:  ");
        printMatrix(matrix);
        System.out.println("Matrix after:  ");
        transport(matrix, matrixT);
        printMatrixT(matrixT);
    }
    static void createMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random()*10);
            }
        }
    }
    static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
    static void transport(int matrix[][], int matrixT[][]) {
        for (int i = 0; i < matrixT.length; i++) {
            for (int j = 0; j < matrixT[i].length; j++) {
                matrixT[i][j] = matrix[j][i];
            }
        }
    }
    static void printMatrixT(int matrixT[][]) {
        for (int i = 0; i < matrixT.length; i++) {
            for (int j = 0; j < matrixT[i].length; j++) {
                System.out.print(matrixT[i][j]);
            }
            System.out.println();
        }
    }
}