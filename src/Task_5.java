public class Task_5 {
    public static void main(String[] args)
    {
        int[][] matrix = {
                {-5,1,0},
                {4,3,1},
                {-2,8,-1}
        };
        System.out.println("Matrix before:  ");
        print(matrix);
        System.out.println("Matrix after:  ");
        transport(matrix);
        print(matrix);
    }
    static void print(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }
    }
    static void transport(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i+1; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}