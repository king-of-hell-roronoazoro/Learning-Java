import java.util.Scanner;
class employee {
    int salary;
     // Each employee has their own salary field
    String name;
    // An INSTANCE method: operates directly on the object's field
    public void getSalary() {
        System.out.println(salary); // "Look up THIS employee's salary and return it"
    }
    public void gettingName(){
        System.out.println(name);
    }
    public void changeName(Scanner sc){ //activates scanner here and doesnt cause an error.
        name = sc.next(); //only type name not string name coz that will create a new string
    }
}

public class OOPQ{
    public static void main(String args[]) {
        employee p = new employee();
        Scanner sc = new Scanner(System.in);
        p.salary=100;
        // Ask 'p' directly for its salary (no parameters needed!)
        p.getSalary(); 
        System.out.println("Enter your name");
        p.name= sc.next();
        p.gettingName();
        System.out.println("Y, N do you want to change your name?");
        String a = sc.next();
        if(a.equalsIgnoreCase("Y")){
            System.out.println("Enter your name");
            p.changeName();
        }
        sc.close();
    }
}