import java.util.Scanner;

class 01010101010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int x = sc.nextInt();
        int i, j;
        for ( i = 1; i <= x; i++){
            for ( j = 1; j <= i; j++){
                if ((i+j) % 2 ==0){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}