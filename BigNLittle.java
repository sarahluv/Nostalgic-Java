/*******************************************************************************
Name: Sarah Redmon
Date: 10/18/18
Instructor: Ms. Tucker
Class: BigNLittle
Purpose: To have a simple game for toddlers to play
*******************************************************************************
*/

import java.util.Scanner;
import java.util.Random;
public class BigNLittle
{
   public static void main (String[] args)
   {
/*------------------------------------------------------------------------------
    Variables and strings initialized here
    ------------------------------------------------------------------------------
    */
       String colorString, bigNum, smallNum, myNum, yourNum, again;
       int childColor, parentColor;
       int colorNum1, colorNum2, childValue, parentValue;
       
/*------------------------------------------------------------------------------
   Randomizes both child's and parent's values
    ------------------------------------------------------------------------------
    */
       Random randGen = new Random();
       childValue = randGen.nextInt(10) + 1;
       parentValue = randGen.nextInt (10) + 1;
       
/*------------------------------------------------------------------------------
    Randomizes child's color
    ------------------------------------------------------------------------------
    */
       colorNum1 = randGen.nextInt(4) + 1;
       switch (colorNum1) {
           case 1:
           childColor = "Red";
           break;
           
           case 2:
           childColor = "Black";
           break;
           
           case 3:
           childColor = "Yellow";
           break;
           
           case 4:
           childColor = "Blue";
           break;
       }

/*------------------------------------------------------------------------------
    Randomizes parent's color
    ------------------------------------------------------------------------------
    */

colorNum2 = randGen.nextInt(4) + 1;
       switch (colorNum2) {
           case 1:
           parentColor = "Red";
           break;
           
           case 2:
           parentColor = "Black";
           break;
           
           case 3:
           parentColor = "Yellow";
           break;
           
           case 4:
           parentColor = "Blue";
           break;
       }
       
/*------------------------------------------------------------------------------
    Sets string for display and also fixes any duplicates
    ------------------------------------------------------------------------------
    */
       Tile childTile = new Tile (childColor, childValue);
       Tile parentTile = new Tile (parentColor, parentValue);
       if(childValue == parentValue){
           parentValue = randGen.nextInt(10) + 1;
       }
       if(childColor == parentColor){
           colorNum2 = randGen.nextInt(4) + 1;
         switch (colorNum2) {
           case 1:
           parentColor = "Red";
           break;
           
           case 2:
           parentColor = "Black";
           break;
           
           case 3:
           parentColor = "Yellow";
           break;
           
           case 4:
           parentColor = "Blue";
           break;
       }
        }
       
/*------------------------------------------------------------------------------
    Displays both toddler's and parent's tiles
    ------------------------------------------------------------------------------
    */
       System.out.println("You:\t" + childColor + " " + childValue);
       System.out.println("Me:\t" + parentColor + " " + parentValue);
       
/*------------------------------------------------------------------------------
    Asks questions for toddler
    ------------------------------------------------------------------------------
    */
       Scanner scan = new Scanner (System.in);
       do
       {
           System.out.println();
           System.out.println("Who has the biggest number (you or me or they are the same)?");
           bigNum = scan.nextLine();
           
           System.out.println();
           System.out.println("Who has the smallest number (you or me or they are the same)?");
           smallNum = scan.nextLine();
           
           System.out.println();
           System.out.println("What color is my number?");
           myNum = scan.nextLine();
           
           System.out.println();
           System.out.println("What color is your number?");
           yourNum = scan.nextLine();
           
           System.out.println();
           System.out.println("Do you want to play this game again? (type Y for yes to play again)");
           again = scan.nextLine();
       }
       while (again.equalsIgnoreCase("y"));
   }
}