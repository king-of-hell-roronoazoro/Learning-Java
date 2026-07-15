public class recursion1 {
    public static void printNum(int n){ //this came before main fuction coz we need to pre define it.
        if(n == 0){
            return; //if n becomes 0 returns the control and stops the recursion.
        }
        System.out.println(n); //prints n.
        printNum(n - 1); //calls itself and reduces n by 1.
    }
    public static void main(String args[]){
        int n = 67; //initialsing by 5.
        printNum(n); //calling the fucntion this is the first call we make it and then the function calls itself.
    }
} 