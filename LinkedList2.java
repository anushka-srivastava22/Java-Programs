class LinkedList2
{
    Node head;
    class Node 
    {
        int data;
        Node next;
        Node (int d)
        {
            data = d;
            next = null;
        }
    }
    Node reverse (Node head , int k)
    {
        Node current = head;
        Node next = null;
        Node prev = null;
        
        int count = 0;
        while (count < k && current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
        if(next != null)
        {
            head.next = reverse (next , k);
        }
        return prev;
    }
    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    void printList()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        LinkedList2 li=new LinkedList2();
        li.push(9);
        li.push(8);
        li.push(7);
        li.push(6);
        li.push(5);
        li.push(4);
        li.push(3);
    
        li.push(2);
        li.push(1);
        System.out.println ("Given List");
        li.printList();
        li.head = li.reverse(li.head , 3);
        System.out.println("Reverse List");
        li.printList();
    }
}