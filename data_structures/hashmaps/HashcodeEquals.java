package hashmaps;


import java.util.*;

/**
 * pen
 */
public class HashcodeEquals {
    public static void main(String[] args) {
        Pen pen1 = new Pen(10,"blue");
        Pen pen2 = new Pen(10,"blue");
        System.out.println(pen1.equals(pen2));
    }
    
}
class Pen
{
    int price;
    String colour;
    public Pen(int price,String colour)
    {
        this.price = price;
        this.colour = colour;
    }   
    @Override
    public boolean equals(Object obj)
    {
        Pen that = (Pen) obj;
        boolean isEqual = this.price == that.price && this.colour.equals(that.colour);
        return isEqual;
    }
}