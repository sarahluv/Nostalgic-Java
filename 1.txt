/*******************************************************************************
Name: Sarah Redmon
Date: 10/11/18
Instructor: Ms. Tucker
Class: Tile
Purpose: To play a simplified game of tiles
*******************************************************************************
*/

import java.util.Random;
import java.util.Scanner;
public class Tile
{    
    /*------------------------------------------------------------------------------
    Instance Data Items
    ------------------------------------------------------------------------------
    */
    private String color;
    private int value;
    private String childColor;
    private int childValue;
    private String parentColor;
    private int parentValue;
    private String childTile;
    private String parentTile;
    private int colorNum;
    
    /*------------------------------------------------------------------------------
    Constructors
    ------------------------------------------------------------------------------
    */
    public Tile()
    {
        color = "NO COLOR";
        value = 0;
    }
    public Tile (String color, int value)
    {
        this.color = color;
        this.value = value;
        if (color == "Red" || color== "Blue" || color == "Black" || color == "Yellow") {
            this.color = color;
        } else {
            this.color = "NO COLOR";
        }
        if (value >= 1 && value <= 14) {
            this.value = value;
        } else {
            this.value = 0;
        }
        if (value == 14 && !(color == "Red" || color == "Black")) {
            this.color = "NO COLOR";
            value = 0;
        }
    }
    
    /*------------------------------------------------------------------------------
    Accessers
    ------------------------------------------------------------------------------
    */
    public String getColor()
    {
        return color;
    }
    public int getValue()
    {
        return value;
    }
    
    /*------------------------------------------------------------------------------
    Mutators
    ------------------------------------------------------------------------------
    */
    public void setColor(String color)
    {
        this.color = color;
        if (color == "Red" || color== "Blue" || color == "Black" || color == "Yellow") {
            this.color = color;
        } else {
            this.color = "NO COLOR";
        }
    }
    public void setValue(int value)
    {
        this.value = value;
        if (value >= 1 && value <= 14) {
            this.value = value;
        } else {
            this.value = 0;
        }
    }
    
    /*------------------------------------------------------------------------------
    tradeTiles() Methods (Helper Method)
    ------------------------------------------------------------------------------
    */
    public void tradeTiles(String color, int value)
    {
        this.color = color;
        this.value = value;
        if (color == "Red" || color== "Blue" || color == "Black" || color == "Yellow") {
            this.color = color;
        } else {
            this.color = "NO COLOR";
        }
        if (value >= 1 && value <= 14) {
            this.value = value;
        } else {
            this.value = 0;
        }
        if (value == 14 && !(color == "Red" || color == "Black")) {
            this.color = "NO COLOR";
            value = 0;
        }
    }
    
    /*------------------------------------------------------------------------------
    equals(Tile checkTile) Methods
    ------------------------------------------------------------------------------
    */
    public boolean equals(Tile checkTile)
    {
        if (childValue.equals(parentValue))
              return true;
       else
              return false;

       if (childColor.equals(parentColor))
              return true;
       else
              return false;

    }
    
    /*------------------------------------------------------------------------------
    toString() Methods
    ------------------------------------------------------------------------------
    */
    public String toString()
    {
        return color + " " + value;
    }
}