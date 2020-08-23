
public class LinkedList1
{
    Node head;
    public void insert(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(head == null)
        {
            head = node;
        }
        else
        {
            Node n = head;
            while(n.next != null)
            {
                n=n.next;
            }
            n.next = node;
        }
    }
    
    public void insertAtStart(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }
    
    public void insertAt(int index , int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(index == 0)
        {
            insertAtStart(data);
        }
        Node n = head;
        for(int i=0; i<index-1; i++)
        {
            n=n.next;
        }
        node.next = n.next;
        n.next = node;
    }
    
    public void swapNodes(int x , int y)
    {
        if(x == y)
        {
            return;
        }
        Node prevX = null , currX = head;
        while(currX != null && currX.data != x)
        {
            prevX = currX;
            currX = currX.next;
        }
        Node prevY = null , currY = head;
        while(currY != null && currY.data != y)
        {
            prevY = currY;
            currY = currY.next;
        }
        if(currX == null || currY == null)
        {
            return;
        }
        if(prevX != null)
        {
            prevX.next = currY;
        }
        else
        {
            head  = currY;
        }
        if(prevY != null)
        {
            prevY.next = currX;
        }
        else
        {
            head = currX;
        }
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }
  
    
    
    public void deleteAt(int index)
    {
        if(index == 0)
        {
            head = head.next;
        }
        else
        {
            Node n = head;
            Node n1 = null;
            for(int i=0; i<index-1; i++)
            {
                n=n.next;
            }
            n1=n.next;
            n.next = n1.next;
            n1 = null;
        }
    }
    
    public void show()
    {
        Node node = head;
        while(node.next != null)
        {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}
