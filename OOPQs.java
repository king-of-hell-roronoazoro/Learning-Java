import java.util.Scanner;

class employee {
    int salary;
    String name;

    public void getSalary() {
        System.out.println(salary);
    }

    public void gettingName() {
        System.out.println(name);
    }

    // Pass the scanner into the method rather than opening/closing a new one
    public void changeName(Scanner sc) {
        System.out.println("Enter your new name:");
        this.name = sc.next(); // Updates the class field, not a local variable
    }
}

public class OOPQs {
    public static void main(String args[]) {
        employee p = new employee();
        Scanner sc = new Scanner(System.in);

        p.salary = 100;
        p.getSalary(); 

        System.out.println("Enter your name:");
        p.name = sc.next();
        p.gettingName();

        System.out.println("Y, N do you want to change your name?");
        String a = sc.next();

        // Use double quotes for String comparison (equalsIgnoreCase handles 'y' or 'Y')
        if (a.equalsIgnoreCase("Y")) {
            p.changeName(sc);
            System.out.print("Updated name: ");
            p.gettingName();
        }

        sc.close(); // Close scanner once at the very end of main
    }
}