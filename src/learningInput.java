import java.util.Scanner;

public class learningInput {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        // next() only takes 1 word
        // nextLine() grabs a whole line

        System.out.println("enter the value of Pi");
        double piValue = keyboard.nextDouble();

        // clearing the buffer

        keyboard.nextLine();

        System.out.println("What your name?");
        String name = keyboard.nextLine();

        System.out.println("how old are you?");
        int age = keyboard.nextInt();

        System.out.println("good morning, " + name);
        System.out.println("you are" + age + " old");


    }
}
