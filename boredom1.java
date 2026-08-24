import java.util.Scanner;
public class boredom1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter the numbers: ");
        int [] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }
            // so the middle is n/2 ad n+1/2
            boolean palindrome = true;
        for(int i = 0; i < size / 2; i++){
            if(array[i] != array[size - 1 - i]){
                palindrome = false;
                break;
            }
        }
            if(palindrome == true){
                System.out.println("its a palindrome");
            }
            else
                System.out.println("Its not a palindrome");
        sc.close();
    }
}