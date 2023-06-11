import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nWhat's your name : ");
        String name = input.nextLine();
        System.out.println("Hi "+name);
        input.close();
    }
}
