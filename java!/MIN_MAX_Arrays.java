import java.util.Scanner;

public class MIN_MAX_Arrays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int Array1[] = new int[size];
        System.out.println("Enter the elements for the array");
        for (int i = 0; i < size; i++){//i=0 coz the index starts from 0.
            Array1[i] = sc.nextInt();
        }
        int min = Array1[0];
        int max = Array1[0]; //Assuming the first element is the minimum and maximum
        for (int i = 1; i < size; i++){// i < size coz the index starts from 0 and i = 1 not i=0 coz we already considered the fist element for min & max
            if (Array1[i] < min){
                min = Array1[i];//replacing the minimum value with the current element if it is smaller
            }
            if (Array1[i] > max){
                max = Array1[i];//replacing the maximum value with the current element if it is larger
            }
        }
        System.out.println("Minimum element in the array is: " + min);
        System.out.println("Maximum element in the array is: " + max);  
        sc.close();
    }
}