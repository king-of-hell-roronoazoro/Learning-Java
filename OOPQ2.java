class Phone{
    String model;
    public void vibrate(){
        System.out.println("Vibrating.......");
    }
    public void ringing(){
        System.out.println("Ringing.........");
    }
}
public class OOPQ2{
    public static void main(String args[]){
        Phone myPhone = new Phone();
        myPhone.model = "Samsung f13";
        System.out.println("The phone model is: " + myPhone.model);
        myPhone.vibrate();
        myPhone.ringing();
    }
}