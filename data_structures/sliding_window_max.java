import java.util.*;
public class sliding_window_max {
    public static void main(String[] args) {
        Solution solution = new Solution();
        

    }
    static class Solution
    {
        public int[] maxSlidingWindow(int a[],int k)
        {
            Deque<Integer> dq = new LinkedList<>();
            int n = a.length;
            int ans[] = new int[n-k+1];
            int i=0;
            for(;i<k;i++)
            {
                while(!dq.isEmpty() && a[dq.peekLast()]<=a[i])
                {
                    dq.removeLast();
                }
                dq.addLast(i);
            }
            for(;i<n;i++)
            {
                ans[i-k] = a[dq.peekFirst()];
                while(!dq.isEmpty() && dq.peekFirst()<=i-k)
                {
                    dq.removeFirst();
                }
                while(!dq.isEmpty() && a[dq.peekLast()]<=a[i])
                {
                    dq.removeLast();
                }
                dq.addLast(i);

            }
            ans[i-k]= a[dq.peekFirst()];
            return ans;


        }
    }


    
}
