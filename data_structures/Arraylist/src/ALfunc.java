import java.util.*;
public class ALfunc {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(4);
        al.add(0,3);//specify the position and add whatever u wanna 
        System.out.println(al);
        System.out.println(al.get(2));
        al.set(2,5);
        System.out.println(al);
        ;//returns the position of 2
       
        //al.remove(0);
        //specify the position which u wanna remove
        //al.remove(new Integer(2));
        //to specify a specific integer u wanna remove
       
       
    }
}
