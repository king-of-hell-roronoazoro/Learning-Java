public class recursion3 {
    public static void printNum(int n, int sum){ //this came before main fuction coz we need to pre define it.
        if(n >= 11){ //coz we want to add till 10.
            return; //if n becomes >10, returns the control and stops the recursion.
        }
        sum += n; //adds n to sum. sum = sum + n
        System.out.println("sum: " + sum); //prints sum
        printNum(n + 1, sum); //calls itself and increases n by 1. you need to sum here too coz otherwise i will show error
    }
    public static void main(String args[]){
        int n = 1; //initialsing by 1.
        int sum = 0;  //starting the sum with 0
        printNum(n, sum); //calling the fucntion this is the first call we make it and then the function calls itself.
    }
} 