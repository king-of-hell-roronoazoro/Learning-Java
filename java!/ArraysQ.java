import java.util.Scanner;

public class ArraysQ {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        System.out.println("enter the elements of the array: ");
        for (int i = 0; i < size; i++){
        numbers[i] = sc.nextInt();
        }
        System.out.println("Enter the number whose index number you want to search: ");
        int number = sc.nextInt();

        for (int i = 0; i < size; i++){ //in java arrays index start from 0 so we have to start the loop from 0.
            if (numbers[i] == number){ //if the number is found in the array then print the index number of that element.
                System.out.println("the index of the number is: " + i);
                break; //if the number is found then we can break the loop because we don't need to search for the number anymore.
            }
            /*else {
                System.out.print("the number you want to search does not exist in the array");
            }*/  //coz if we include this it will print the MSG till the break happens and we dont want that just the "if" statement is enough
        }
        sc.close();
    }
}