public class printingnumbers {
    public static void main(String[] args){
        for ( int x = 0; x<11; x = x + 1 ){
            System.out.println(x);
        } 
        for ( int y = 0; y < 11; y = y + 2){
            System.out.println(y);
        }
        System.out.println("this is how we can print only even numbers");
        for ( int z = 1; z < 11; z = z + 2){
            System.out.println(z);
        }
        for ( int p = 0; p > -11; p = p - 1) {
            System.out.println(p);
        }
        System.out.println("this is how we can print negative numbers");
    }
}