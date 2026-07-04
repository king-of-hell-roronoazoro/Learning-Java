/* Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
Example : 
email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
email = “helloWorld123@gmail.com”; username = “helloWorld123” */

import java.util.Scanner;

public class userName{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email ID: ");
        String mail = sc.next(); //we dont need nextLine() coz the mail doesnt have any spaces in it.
        String username = mail.substring(0, mail.indexOf('@')); //we are using substring to get the part of the string before '@' and indexOf to find the position of '@'.
                //substring starts from 0 and ends where the index is @.
        System.out.println("The username is: " + username);
        sc.close();


        //NORMAL WAY OF DOING IT.

        String username1 = "";
        for(int i = 0; i < mail.length(); i++){
            if(mail.charAt(i) == '@'){
                break;
            } //comes before so that @ doesnt get printed
            username1 += mail.charAt(i);
        }
        System.out.print("The username is: " + username1);
    }
}