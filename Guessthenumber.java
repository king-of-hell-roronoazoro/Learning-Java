import java.util.*;
class game{
    private int compno;
    private int userno;
    int operation = 0;
    int noguesses = 0;//number of guesses
    void getInput(int no){
        userno = no; //puts user no = no coz userno is private.
    }
    void guessgame(){
        Random random = new Random();
        compno = random.nextInt(100)+1; //selects a number.
    }
    void checknumber(){
        if(userno == compno){
            System.out.println("You guessed correct!");
            operation = 1;
        }else if(userno > compno){
            System.out.println("You guessed a bit high");
            noguesses++;
        }else if(userno < compno){
            System.out.println("Guess Higher");
            noguesses++;
        }
    }
}
public class Guessthenumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        game player = new game();
        player.guessgame(); //calls comp so it prepares a number.
        System.out.println("Guess the number between 1 to 100");
        while(player.operation == 0){
            int in = sc.nextInt(); //read guess
            player.getInput(in);  //pass guess to game || give in as input for getInput() as no variable.
            player.checknumber(); //check guess
        }
        System.out.println("No of guesses is: " + player.noguesses);
        sc.close();
    }
}