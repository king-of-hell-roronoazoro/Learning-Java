import java.util.Scanner;
import java.util.Random;
public class randomGen{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter 1 for rock, 2 for paper, 3 for scissors: ");
        int input = sc.nextInt();
        int compInt = random.nextInt(3)+1; //random.nextInt(); creates any no from -2bill to 2 bill
        if(compInt == input){                  //random.nextInt(3); 0-2, random.nextInt(3)+1; 1-3
            System.out.println("Its a draw");
        }else if(input == 1 && compInt == 3||input == 2 && compInt==1||input == 3 && compInt==2){
            System.out.println("You win!");
        }else{
            System.out.println("Computer wins!");
        }
        sc.close();
    }
}