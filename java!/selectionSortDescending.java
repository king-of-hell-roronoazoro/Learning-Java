import java.util.Scanner;

public class selectionSortDescending {
       public static void main(String args[]){
              Scanner sc = new Scanner(System.in);
              System.out.println("Enter the size of the array: ");
              int size = sc.nextInt();
              int array[] = new int[size];
              System.out.println("Enter the elements of the array: ");
              for(int i = 0; i < size; i++){
                     array[i] = sc.nextInt();//taking array input
              }
              for(int i = 0; i < size - 1; i++){
                     //here instead of choosing the smallest and putting it in front we are choosing the biggest and putting it in front.
                     //checking
                     int biggest = i;
                     for(int j = i + 1; j < size; j++){ //j = i+1 to size coz we already placed some numbers and we dont want to disturb them.
                            //checking and selecting the biggest
                            if(array[j] > array[biggest]){  //if array[j] is bigger then we take the index of that instead.
                                   biggest = j; //storing the index of the biggest number
                            }
                            //we put this in j loop coz we dont wanna go to the numbers which have already been selected and placed at the end.
                     }
                     //swapping
                            int temp = array[biggest];
                            array[biggest] = array[i];
                            array[i] = temp;
                            //this is in i loop coz swapping isnt part of the checking in which we dont wanna disturb the fixed numbers.
              }
              for(int i = 0; i < size; i++){
                     if(i < size - 1){
                            System.out.print(array[i] + ", ");
                     }
                     else{
                            System.out.print(array[i]);
                     }
              }
              sc.close();
       }
}