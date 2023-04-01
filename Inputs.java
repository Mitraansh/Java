import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter some Input ");
        int rollno = input.nextInt();
        System.out.println("Your number is "+rollno);
        input.close();
    }
}
