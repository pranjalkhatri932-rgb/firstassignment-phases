

import java.util.Scanner;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.print("Welcome to the Galatic Bureau of Intersteller Tourism traveller\n");
        System.out.print("This is the place where your journey through the universe begins\n");
        System.out.print("Before your journey begins lets start with little bit about yourself and let's see if the destination of your choice is a match for you\n");
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        System.out.print("What planet are you from?");
        String planet = scan.nextLine();

        System.out.print("Welcome " + name + " from " + planet);

        System.out.print("whats the temperature in that planet? ");
        int temperature = Integer.parseInt(scan.nextLine());

        if (temperature < 100 && temperature > -50 ) {
            System.out.print("This planet is safe to travel");
        }
        else {
            System.out.print(" it's to dangerous to travel there");
        }




    }
}
