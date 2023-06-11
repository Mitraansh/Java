//import Scanner
import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        
        //See Learn the Part for the complete instructions. 

        Scanner scanner = new Scanner(System.in);
        //set up scanner. 

        System.out.println("Hello. What is your name?");
        //Pick up user's name and store it. 
        String name = scanner.next();
                           
        //add new a line before asking next question. 
        System.out.println("Hi "+ name +"! I'm Javabot.\nWhere are you from?");
        //Pick up user's home and store it.
        scanner.nextLine(); 
        String address = scanner.nextLine();                

        //add new a line before asking next question.
        System.out.println("I hear it's beautiful at "+ address+"! I'm from a place called Oracle");
        System.out.println("How old are you?");
        //Pick up age and store it.
        int age = scanner.nextInt();

        //add new a line before asking next question.
        System.out.println("So you're "+age+", cool! I'm 400 years old.");
        System.out.println("This means I'm "+(400/(double)age)+" times older than you.");
        System.out.println("Enough about me. What's your favourite language? (just don't say Python)");
        //Pick up language and store it. 
        scanner.nextLine();
        String lang = scanner.nextLine();

        //add new a line here.
        System.out.println(lang+" , that's great! \nNice chatting with you "+name+". I have to log off now. See ya!");
        
        //close scanner. 
        scanner.close();

        
    }
}
