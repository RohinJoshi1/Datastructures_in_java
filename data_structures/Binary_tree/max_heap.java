public class max_heap {
    private int[] heap;
    private int size;
    private int max_size;
    public max_heap(int max_size){
        this.size=0;
        this.max_size=max_size;
        heap = new int[this.max_size +1];
        heap[0]=Integer.MAX_VALUE;

    }
    private int parent(int pos)
    {
        return pos/2;
    }
    private int left_child(int pos)
    {
        return (2*pos);

    }
    private int right_child(int pos)
    {
        return ((2*pos)+1);
        
    }
    private boolean isLeaf(int pos)
    {
        if(pos>(size/2)&&pos <=size)
        {
            return true;

        }
        return false;
    }
    public void max_heapify(int pos)
    {
        if(isLeaf(pos))
        {
            return;
        }
        if(heap[pos]<heap[left_child(pos)] || heap[pos]<heap[right_child(pos)])
        {
            if(heap[left_child(pos)]>heap[right_child(pos)])
            {
                swap(pos,left_child(pos));
                max_heapify(left_child(pos));
            }
        }
        else
        {
            swap(pos,right_child(pos));
            max_heapify(right_child(pos));
        }
    }
    private void swap(int fpos,int spos)
    {   
        int temp;
        temp= heap[fpos];
        heap[fpos]=heap[spos];
        heap[spos]=temp;
    }
    public void insert(int element)
    {
        heap[++size]=element;
        int current = size;
        while(heap[current]>heap[parent(current)])
        {
            swap(current, parent(current));
            current = parent(current);
        }

    }
    public void print()
    {
        for (int i = 1; i <= size / 2; i++) {
            System.out.print(
                " PARENT : " + heap[i]
                + " LEFT CHILD : " + heap[2 * i]
                + " RIGHT CHILD :" + heap[2 * i + 1]);
            System.out.println();
        }
    }
    public int extractMax()
    {
        int popped = heap[1];
        heap[1]=heap[size--];
        max_heapify(1);
        return popped;
    }
    public static void main(String[] args) {
        max_heap maxHeap = new max_heap(15);
        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(17);
        maxHeap.insert(10);
        maxHeap.insert(84);
        maxHeap.insert(19);
        maxHeap.insert(6);
        maxHeap.insert(22);
        maxHeap.insert(9);
  
        maxHeap.print();
        System.out.println("max val is "+maxHeap.extractMax());
    }

}



