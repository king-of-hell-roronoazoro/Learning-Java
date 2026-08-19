class employee{
    int id;
    String name;
    public void printDetails(){
        System.out.println("name is: " + name);
        System.out.println("id is: " + id);
    }
}
public class OOP{
    public static void main(String args[]){
        System.out.println("Creating an object of employee");
        employee admin = new employee();
        admin.name="karthikeya";
        admin.id=6769;
        //but if i type admin.age it wont work coz we have to define age in the class employee
        //System.out.println(admin.name);
        employee noob = new employee();
        noob.name="vamsi";
        //System.out.println("noob name is: " + noob.name);
        admin.printDetails(); //calling the method printDetails() of employee class,so that i dont have to sout very time.
        noob.printDetails();
    }
}