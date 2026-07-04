import java.util.Scanner;

public class insertionSortDescending {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }

        //sorting
        for(int i = 1; i < size; i++){
            //insertion sort
            int currentNumber = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] < currentNumber){
                //                   ^-- the only change...
                array[j+1] = array[j];
                j--;
            }

            //placing
            array[j + 1] = currentNumber;
        }

        for(int i = 0; i < size; i++){
            if(i < size - 1){
                System.out.print(array[i] + ", ");
            } else{
                System.out.print(array[i]);
            }
        }
        sc.close();
    }
}




/*for(int i=1; i<arr.length; i++) {
           int current = arr[i];
           int j = i - 1;
               while(j >= 0 && arr[j] > current) {
                   //Keep swapping
                   arr[j+1] = arr[j];
                   j--;
               }
           arr[j+1] = current;
 */