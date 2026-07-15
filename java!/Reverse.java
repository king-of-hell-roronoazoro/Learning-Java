import java.util.Scanner;

public class Reverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string you want to reverse: ");
        String A = sc.nextLine();

        //Without StringBuilder.

        int size = A.length();
        //int a = i + 1; //coz the character position = index + 1.

        char array[] = new char[size]; //cant do String array[] coz we are gonna nsert char in the loop.

        for(int i = 0; i < size; i++){  //i < size instead of i < size - 1 coz while entering we need 0-size that is: length exactly but down there we dont.*******
            array[i] = A.charAt(i); // coz char positions and the indexes start from 0 only.********************************
        }

        String newA = "";

        for(int i = size - 1; i >= 0; i--){ //'i = size - 1' coz its in reverse so we cant put "i < size" but we start from zero so we must end with one less.***************************
            newA += array[i];
        }

        System.out.println("The reverse of the String you entered is: " + newA);

        //Versus with StringBuilder

        System.out.println("Enter the string again");

        StringBuilder B = new StringBuilder(sc.nextLine());

        B.reverse();

        System.out.print("The reverse is: " + B);

        sc.close();
    }
}