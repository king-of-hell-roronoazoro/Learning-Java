import java.util.Scanner;

public class bubbleSort {
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
                     for(int j = 0; j < size - (i + 1); j++){ //we take a second loop "j" coz we need two loops one for sorting and 1 for repeating the sorting n-1 times.
                            if(array[j] > array[j + 1]){ //why is j<size-i-1? coz we only need to sort size-i-1 numbers coz in later rounds there some nujmbers alreday in fixed place
                                   //swapping
                                   int temporary = array[j];
                                   array[j] = array[j + 1];
                                   array[j + 1] = temporary;
                            }
                     }
              }
             /*do{
              if(array[i] > array[i + 1]){
                            //swapping
                            int temporary = array[i];
                            array[i] = array[i + 1];
                            array[i + 1] = temporary;
                     }
                     i++;
             } while(i < size - 1);*/
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