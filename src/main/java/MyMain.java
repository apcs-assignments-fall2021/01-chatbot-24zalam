import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name=scan.next();
        System.out.println("Hi "  + name);
        System.out.println("How old are you?");
        int age =scan.nextInt();
        System.out.println("Wow " + age + "!" );
        System.out.println("Is the glass half-empty or half-full?");
        String glass=scan.nextLine();
        System.out.println("I think I would have to disagree, the glass can't be " +  glass);
        System.out.println("What is your favorite subject?");
        String subject=scan.nextLine();
        System.out.println("Oh I like  "+  subject +  " too");
        System.out.println("Who is your favorite artist?");
        String artist=scan.nextLine();
        System.out.println("I like " + artist +  " too!");
        System.out.println("What's your phone number?");
        int phone =scan.nextInt();
        System.out.println("Cool, confirming it's " +   phone + "?"+" Let's talk again soon!");




        scan.close();
    }
}
