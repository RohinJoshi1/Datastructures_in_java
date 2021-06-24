import java.util.*;
public class zero_sum_subarray {
    public static void main(String[] args) {
        Set<Integer> x = new HashSet<>();
        int sum=0;
        boolean found = false;
        int a[] = {1,3,5,-5,4,3};
        for(int element:a)
        {
            x.add(sum);
            sum+=element;
           
            if(x.contains(sum))
            {
                found = true;
                break;

            }
        }
        System.out.println(found);

        

    }
}
