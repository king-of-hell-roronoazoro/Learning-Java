//For a given matrix of N x M, print its transpose.

import java.util.Scanner;

public class TransposeOfMatrix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Matrix:");
        System.out.print("Rows: ");
        int rows = sc.nextInt();
        System.out.print("Columns: ");
        int cols = sc.nextInt();
        int numberMatrix[][] = new int[rows][cols];
        System.out.println("Enter the elements of the matrix: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                numberMatrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(numberMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The Transpose of the matrix is: ");
        for(int j = 0; j < cols; j++){
            for(int i = 0; i < rows; i++){
                System.out.print(numberMatrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}