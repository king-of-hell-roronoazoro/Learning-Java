import java.util.Scanner;

class SwitchCASESTACKER {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Which season are you in? (1. Spring, 2. Summer, 3. Autumn, 4. Winter)");
        System.out.println("Enter the month: ");
        int month = sc.nextInt();
        switch (month) {
            case 1, 2, 3 -> System.out.println("You are in Spring.");
            case 4, 5, 6 -> System.out.println("You are in Summer.");
            case 7, 8, 9 -> System.out.println("You are in Autumn.");
            case 10, 11, 12 -> System.out.println("You are in Winter.");
            default -> System.out.println("Invalid month. Please enter a number between 1 and 12.");
        }
        sc.close();
    }
}