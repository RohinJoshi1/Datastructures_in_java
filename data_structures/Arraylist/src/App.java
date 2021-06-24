

import java.util.*;
import java.util.List;
import java.util.ArrayList;



public class App {
    

    public static void main(String[] args) {
    List<String> SL = new ArrayList();
    Scanner s= new Scanner(System.in);
    
    System.out.println("Enter items you wish to add");
    System.out.println("Enter 0 to exit");
    while(true)
    {   
        String input = s.nextLine();
        SL.add(input);
        if(input.equals("0"))
        {
            break;
        }

    }
    for (String value : SL){
        System.out.println(value);
    }
    
    

    
    
}
}