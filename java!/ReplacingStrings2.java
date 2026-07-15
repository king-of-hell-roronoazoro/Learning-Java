/* Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
Example : 
original = “eabcdef’ ; result = “iabcdif”
Original = “xyz” ; result = “xyz” */

import java.util.Scanner;

public class ReplacingStrings2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String A = sc.nextLine();
        String result = ""; // initialising as empty. ************and coz we cant change the string we have to create a new one and add to it.********
            for(int i = 0; i < A.length(); i++){
            if(A.charAt(i) == 'e'){ //we cant do (A.charAt(i)).isEquals("e")....
                result += 'i'; // we can use a charater but we cant do "result = result + i" coz its not an integer to add we are replacing the thing
            }
            else{
                result += A.charAt(i); //its its not e it will be added to the result as it is.
            }
        }
        System.out.println("The result is: " + result);


        int eCount = 0;
        for(int i = 0; i < A.length(); i++){
            if(A.charAt(i) == 'e'){
                eCount++;
            }
        }
        System.out.println("the number of e's is: " + eCount);
        int eIndex = -1; //initialising as -1 coz if we dont find any e then it will be -1 and we can check that.
        for(int i = 0; i < A.length(); i++){
            if(A.charAt(i) == 'e'){
                eIndex = i;
            }
            if(eIndex != -1){
                System.out.print(eIndex + " ");
            } //makes sure that we only print indexes of e's if the index is not -1
            eIndex = -1; //Resets the index for the next iteration************
        }
        if(eCount > 0){
            System.out.print("is/are the index(es) of e's in the string");
        }
        sc.close();
    }
        }