import java.util.Scanner;

public class functions{
    public static void printingnames (String name){
        System.out.print(name);//prints the name
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();// taking the name as input
        
        printingnames(name); //calling the above function which will execute the code inside it and print the name
        sc.close();
    }
}