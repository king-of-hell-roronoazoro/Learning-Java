import java.util.Scanner;

public class userNameADV {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email ID: ");
        String mail = sc.next(); //we dont need nextLine() coz the mail doesnt have any spaces in it.
        
        int atCount = 0;
        for(int i = 0; i < mail.length(); i++) {
        if(mail.charAt(i) == '@') {
            atCount++;
        }
    }

        if(atCount != 1) {
          System.out.println("Error: Invalid Email Format");
        } else {
            String username1 = "";
         for(int i = 0; i < mail.length(); i++){
            if(mail.charAt(i) == '@'){
                break;
            } //comes before so that @ doesnt get printed
            username1 += mail.charAt(i);
          }
        System.out.print("The username is: " + username1);// Proceed with your substring or loop logic here
        }

        sc.close();
    }
}