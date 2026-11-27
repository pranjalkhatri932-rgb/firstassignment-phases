

import java.util.Scanner;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     System.out.print("Welcome to the Galatic Bureau of Intersteller Tourism traveller\n");
     System.out.print("This is the place where your journey through the universe begins\n");
     System.out.print("Before your journey begins lets start with little bit about yourself and let's see if the destination of your choice is a match for you\n");
     Scanner scan = new Scanner(System.in);

     System.out.print("Enter your name: ");
     String name  = scan.nextLine();

     System.out.print("What planet would you like to visit");
     String planet = scan.nextLine();

     System.out.print("Welcome " + name + " to the " + planet );
        }
    }
