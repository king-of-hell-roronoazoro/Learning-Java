import java.util.Scanner;
public class reversing{
    public static void main(String args[]){
        System.out.println("Enter the string that is to be reversed: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        char[] Array = new char[word.length()];
        for (int i = 0; i < word.length(); i++){
            Array[i] = word.charAt(i);
        }
        System.out.println(Array);
        char[] Array2 = new char[word.length()];
        int n = word.length() - 1;
        for(int i = word.length() - 1; i >= 0; i--){
            Array2[n-i] = Array[i];
        }
        System.out.println(Array2);
        sc.close();
    }
}