//finding the first and last occurenec of a character in a string

import java.util.Scanner;

public class occuring{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        StringBuilder word = new StringBuilder(sc.nextLine());
        char letter = word.charAt(0);
        int endPos = 0;
        for(int i = 0; i < word.length(); i++){
            if(letter == word.charAt(i)){
                System.out.println("the charater reappers at index: " + i);
                endPos = i;
            }
        }
        System.out.println("the last occurence of the character is at index: " + endPos);
        sc.close();
    }
}