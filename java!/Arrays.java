import java.util.Scanner;

public class Arrays{
    static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        String names[] = new String[size];

        for(int i = 0; i < size; i++){
            System.out.println("Enter the names: ");
            names[i] = sc.next();
        }
        System.out.println("the names are: ");
        for (int i = 0; i < size; i++){
           System.out.println(names[i]); 
        }
        
        
        sc.close();
    }
}