/*Take an array of numbers as input and check if it is an array sorted in ascending order.
Eg : { 1, 2, 4, 7 } is sorted in ascending order.
       {3, 4, 6, 2} is not sorted in ascending order*/

import java.util.Scanner;

public class ascendingAndDesending {
       public static void main(String args[]){
              Scanner sc = new Scanner(System.in);
              System.out.println("Enter the size of the array: ");
              int size = sc.nextInt();
              int array[] = new int[size];
              System.out.println("Enter the elements of the array: ");
              for(int i = 0; i < size; i++){
                     array[i] = sc.nextInt();//taking array input
              }
              boolean Asending = false; //Assuming
              boolean Desending = false; 
              for(int i = 0; i < size - 1; i++){ //if the i is 1 and size is 2 then (i+1) is 2 but the index is 1 so it show error so we take size-1
                     if(array[i] < array[i + 1]){//the first number is less than the second
                            Asending = true;
                     }
                     if(array[i] > array[i + 1]){//the first number is bigger than the second
                            Desending = true;
                     }
              }
              if(Asending == true && Desending == false){
                     System.out.println("The array is sorted in ascending order.");
              }
              else if(Asending == false && Desending == true){
                     System.out.println("The array is sorted in descending order.");
              }
              else{
                     System.out.println("The array is not sorted in either ascending or descending order.");
              }
              sc.close();
       }
}