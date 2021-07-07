public class Mylinkedlist {
    Node head;
    void add(int data)
    {
        Node toadd = new Node(data);
        Node temp = head;
        if(head==null)
        {
            head= toadd;
            return;
        }
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        temp.next  = toadd;
        
    }
    void remove(int data)
    {
        Node temp=head;
        while(temp.next.data != data )
        {
            temp = temp.next;
        }
        temp = temp.next.next;
        temp.next = null;

    }
    static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            next = null;
        }
    }
}
