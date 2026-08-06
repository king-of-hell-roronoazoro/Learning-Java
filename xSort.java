import java.util.Scanner;
public class xSort{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String Str = sc.nextLine();
        int x = 0;
        String newStr = "";
        for(int i = 0; i < Str.length(); i++){
            if(Str.charAt(i) == 'x'){
                x++;
            } else{
                newStr = newStr + Str.charAt(i);
            }
        }
        for(int i = 0; i < x; i++){
            newStr = newStr + 'x';
        }
        System.out.println(newStr);
        sc.close();
    }
}