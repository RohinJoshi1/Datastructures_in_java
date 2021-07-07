package linkedliststuff;
/**
 * Mylinkedlist
 */
public class Mylinkedlist<E> {
      Node<E> head;
     public void add(E data)
    {
        Node<E> toadd = new Node<E>(data);
        Node<E> temp = head;
        if(isEmpty())
        {
            head = toadd;
            return;
        }
        while(temp.next!= null)       
        {
            temp = temp.next;
            
        }
        temp.next = toadd.next;
        temp.next = toadd;
        
    }
    public boolean isEmpty()
    {
        return (head==null);
    
    }
    public E removelast() throws Exception
    {

        Node<E> temp = head;
        if (temp==null)
        {
            throw new Exception("Cannot remove element from empty list");
        }
        if(temp.next == null)
        {
            Node<E> toremove = head; 
            head = null;
            return (E)toremove.data;
        }
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        Node<E> tormv = temp.next;
        temp.next = null;
        return (E) tormv.data;
    }
    public E getlast() throws Exception
    {
        Node<E> temp = head;
        if (temp==null)
        {
            throw new Exception("Cannot peak element from empty list");
        }
        while(temp.next!= null)
        {
            temp = temp.next;

        }
        return temp.data;

    }
    public void print()
    {
        Node<E> temp= head;
        while(temp!= null)
        {
            System.out.println(temp.data);
            temp = temp.next;
            
        }
    }
     public static class Node<E>{
        E data;
        Node<E> next;
        public Node(E data)
        {
            this.data = data;
            next = null;
        }
    }



    
}
