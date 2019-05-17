import jsjf.ArrayStack;
import java.util.Scanner;

public class CanineApp
{
    public static void main (String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        String direction, direction2 = "", nextDirection = "";
        int westValue = 0, eastValue = 0, southValue = 0, northValue = 0;
        ArrayStack<String> stack = new ArrayStack<String>();
        
        do {
            System.out.println("Please put in a direction: ");
            direction = scnr.nextLine();
            System.out.println();
            
            stack.push(direction);
            
            if (direction.equalsIgnoreCase("West")) {
                westValue += 1;
            } if (direction.equalsIgnoreCase("East")) {
                eastValue += 1;
            } if (direction.equalsIgnoreCase("South")) {
                southValue += 1;
            } if (direction.equalsIgnoreCase("North")) {
                northValue += 1;
            }
            
            System.out.println("Put in another direction?");
            nextDirection = scnr.nextLine();
            System.out.println();
        } while (nextDirection.equalsIgnoreCase("Yes"));
        
        if (nextDirection.equalsIgnoreCase("No")) {
            System.out.println("Type 1 to see directions, type 2 to see directions reversed, or type 3 to see shortest route possible.");
            String choice = scnr.nextLine();
            System.out.println();
            
            if (choice.equals("1")) {
                while (!stack.isEmpty()) {
                    System.out.println(stack.pop());
                }
            }
            
            if (choice.equals("2")) {
                while (!stack.isEmpty()) {
                    switch (direction) {
                        case "West":
                        direction2 = "East";
                        break;
                        
                        case "East":
                        direction2 = "West";
                        break;
                        
                        case "South":
                        direction2 = "North";
                        break;
                        
                        default:
                        direction2 = "South";
                        break;
                    }
                    stack.push(direction2);
                    System.out.println(stack.pop());
                }
            }
                
            if (choice.equals("3")) {
                System.out.println("North count was " + northValue + ". South count was " + southValue + ".");
                System.out.println("East count was " + eastValue + ". West count was " + westValue + ".");
            }
        }
    }
}

