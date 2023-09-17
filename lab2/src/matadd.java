import java.util.Scanner;

class MatrixMeet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows, columns;

        System.out.print("Enter the number of rows for matrices A and B: ");
        rows = scanner.nextInt();
        System.out.print("Enter the number of columns for matrices A and B: ");
        columns = scanner.nextInt();


        int[][] A = new int[rows][columns];
        int[][] B = new int[rows][columns];


        scanMatrix('A', A, scanner);
        scanMatrix('B', B, scanner);

        printMatrix('A', A);
        printMatrix('B', B);

        System.out.println("\nMeet of matrices A and B:");
        int[][] result = calculateMeet(A, B);
        printMatrix(result);

        scanner.close();
    }


    static void scanMatrix(char matName, int[][] mat, Scanner scanner) {
        System.out.printf("Enter data for matrix %c:\n", matName);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }
    }


    static void printMatrix(char matName, int[][] mat) {
        System.out.printf("\nMatrix %c:\n", matName);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static int[][] calculateMeet(int[][] A, int[][] B) {
        int rows = A.length;
        int columns = A[0].length;
        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = A[i][j] & B[i][j];
            }
        }

        return result;
    }


    static void printMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
