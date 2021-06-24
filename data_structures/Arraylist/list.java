package  Arraylist;
import java.util.*;
import java.util.List;
import java.util.ArrayList;



public class list {
    

    public static void main(String[] args) {
    List<String> SL = new ArrayList();
    System.out.println("Enter items you wish to add");
    System.out.println("Enter 0 to exit");
    Scanner s= new Scanner(System.in);
    

    do
    {
        SL.add(s.nextLine());
    }
    while(s.nextLine()!="0");
    System.out.println(SL);

}
}