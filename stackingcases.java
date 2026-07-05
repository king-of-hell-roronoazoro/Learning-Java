import java.util.Scanner;

class stackingcases {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Which season are you in? (1. Spring, 2. Summer, 3. Autumn, 4. Winter)");
        System.out.println("Enter the month to find out: ");
        int month = sc.nextInt();
        switch (month) {
            case 3, 4, 5 -> System.out.println("You are in Spring.");
            case 8, 7, 6 -> System.out.println("You are in Summer.");
            case 11, 10, 9 -> System.out.println("You are in Autumn.");
            case 1, 2, 12 -> System.out.println("You are in Winter.");
            default -> System.out.println("Invalid month. Please enter a number between 1 and 12.");
        }
        sc.close();
    }
}