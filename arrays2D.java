import java.util.Scanner;

public class arrays2D {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = sc.nextInt();
        int numbers[][] = new int[rows][cols];
        System.out.println("Enter the numbers of the array:");
        int i = -1;
        int j = -1;//we cant use 0 coz we are starting the loop from 0
        for(i = 0; i < rows; i++){ //rows first
            for(j= 0; j < cols; j++){//then columns
                numbers[i][j] = sc.nextInt();
            }
        }
        int coords[] = new int[2];//coz we cant return 2 values in a function so we use an array to store the indices of the number we are looking for.
        coords[0] = -1;//we take -1 coz we dont want to print 0,0 if the number is not found
        coords[1] = -1;
        System.out.println("Enter the number you want to search:");
        int numberx = sc.nextInt();
        for(i = 0; i < rows; i++){
            for(j = 0; j < cols; j++){
                if(numbers[i][j] == numberx){
                    coords[0] = i;
                    coords[1] = j;
                    break; // stops the inner loop if the number is found, we dont want to keep searching for the same number
                }
            }if(coords[0] != -1 || coords[1] != -1) break; // Stop looking in other rows if the number is already found in the current row 
        }                                             //we can use break without {} coz even without {} 'if' can fucntion a single line of code after it
        if(coords[0] == -1 && coords[1] == -1){
            System.out.println("The number is not found in the array.");
        }else{
        System.out.print("The indices of the numbers are: " + coords[0] + "," + coords[1]);
        }
        sc.close();
    }
}