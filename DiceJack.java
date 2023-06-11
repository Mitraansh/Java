import java.util.Scanner;
public class DiceJack {
    public static void main(String[] args) {
        int x=roll();
        int y=roll();
        int z=roll();
        System.out.printf("User input Numbers: %d %d %d\n",x,y,z);
        int a=rollDice();
        System.out.println("First roll Dice number: "+a);
        int b=rollDice();
        System.out.println("Second roll Dice number: "+b);
        int c=rollDice();
        System.out.println("Third roll Dice number: "+c);
        if ((x+y+z)<(a+b+c)){
            System.out.println("You win!!!");
        }
        else{
            System.out.println("You Lost! Better Luck Next Time");
        }

    }
    public static int rollDice(){
        double randomNumber=Math.random()*6;
        int result = (int)randomNumber+1;
        return result;
    }
    public static int roll(){
        
        System.out.println("Enter value between 1 and 6 :");
        Scanner scanner = new Scanner(System.in);
        int val1 = scanner.nextInt();
        return val1;
    }
}
