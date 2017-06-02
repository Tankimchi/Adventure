import java.util.Scanner;

public class Adventure {
     public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String firstOption, secondOption, thirdOption;
        System.out.println("WELCOME TO MITCHELL'S TINY ADVENTURE!");
        System.out.println();
        System.out.println("You are in a creepy house! Would you like to go \"upstairs\" or \ninto the \"kitchen\"?");
        System.out.println();
        System.out.print("\n> ");
        firstOption = keyboard.next();
        System.out.println();
        if (firstOption.equalsIgnoreCase("kitchen")) {
            System.out.println("There is a long countertop with dirty dishes everywhere. Off to one side there is, as you'd expect, a refrigerator. You may open the \"refrigerator\" or look in a \"cabinet\".");
            System.out.println();
            System.out.print("\n> ");
            secondOption = keyboard.next();
            System.out.println();
            if (secondOption.equalsIgnoreCase("refrigerator")) {
                System.out.println("Inside the refrigerator you see food and stuff. It looks pretty nasty. \nWould you like to eat some of the food? (\"yes\" or \"no\")");
                System.out.println();
                System.out.print("\n> ");
                thirdOption = keyboard.next();
                System.out.println();
                if (thirdOption.equalsIgnoreCase("yes")) {
                    System.out.println("You eat the food and have mud butt.");
                } else {
                    System.out.println("You die of starvation... eventually.");
                }
            } else {
                System.out.println("A cat jumped out and ran but you're ok. Just a little startled.");
            }
        } else {
            System.out.println("Upstairs you see a hallway. At the end of the hallway is the \nmaster \"bedroom\". There is also a \"bathroom\" off the hallway. Where would you like to go?");
            System.out.println();
            System.out.print("\n> ");
            secondOption = keyboard.next();
            System.out.println();
            if (secondOption.equalsIgnoreCase("bedroom")) {
                System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture. \nThe bed is unmade. In the back of the room, the closet door is ajar. Would you like to open the door? (\"yes\" or \"no\")");
                System.out.println();
                System.out.print("\n> ");
                thirdOption = keyboard.next();
                System.out.println();
                if (thirdOption.equalsIgnoreCase("yes")) {
                    System.out.println("Well, then I guess you'll never know what was in there.  Thanks for playing, \nI'm tired of making nested if statements. ");
                } else {
                    System.out.println("Get out the house and run home then.");
                    System.out.println();
                }
            } else {
                System.out.println("You are inside the bathroom and you see a shower curtain covering a bathtub. \nDo you want to uncover the shower curtain and check? (\"yes\" or \"no\")");
                System.out.println();
                System.out.print("\n> ");
                thirdOption = keyboard.next();
                System.out.println();
                if (thirdOption.equalsIgnoreCase("yes")) {
                    System.out.println("You uncover the shower curtain and take a bath in the nasty tub.");
                } else {
                    System.out.println("You should probably get out the house and run home.");
                    System.out.println();
                }
            }
        }
    }
}