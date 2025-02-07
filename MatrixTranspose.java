  import java.util.Scanner;

public class MatrixTranspose {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define the size of the matrix
        int rows = 3;
        int cols = 3;

        // Initialize the matrix
        int[][] matrix = new int[rows][cols];
        int[][] transpose = new int[cols][rows];

        // Input the matrix
        System.out.println("Enter the elements of the 3x3 matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Calculate the transpose of the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Print the original matrix
        System.out.println("\nOriginal Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Print the transpose of the matrix
        System.out.println("\nTranspose Matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

       sc.close();
    }
}
    

