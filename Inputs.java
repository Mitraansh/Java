import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.print("Please enter some Input ");
        // int rollno = input.nextInt();
        // System.out.println("Your number is "+rollno);
        // input.close();

        // To enter million we can use _ instead of , as _ will be ignored
        //int a=234_000_000;
        //System.out.println(a);

        String name = input.nextLine();
        System.out.println(name);
    }
}
