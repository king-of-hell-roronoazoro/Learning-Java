import java.util.Scanner;

public class updateBitN {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int x = 0; 
        
        do {
            System.out.println("Enter the number: ");
            int n = sc.nextInt();
            
            System.out.println("Enter the position of the bit you want to update: ");
            int i = sc.nextInt();
            
            System.out.println("Enter the target value you want to set (0 or 1): ");
            int target = sc.nextInt(); // User explicitly chooses the final outcome
            
            // Step 1: Clear Bit (Create the clean slate)
            int bitMask = 1 << i;
            if(target == 0){
                int notBitMask = ~(bitMask);
                int newNumber = notBitMask & n;
                System.out.println("The number formed is: " + newNumber);
            }
            else{
                int newNumber = bitMask | n;
                System.out.println("The number formed is: " + newNumber);
            }
            System.out.println("Enter 0 if you want to exit, enter 1 if not.");
            x = sc.nextInt(); 
        } while(x == 1);       
        sc.close();
    }
}