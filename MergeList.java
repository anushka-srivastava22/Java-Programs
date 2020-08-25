class MergeList
{

    Node head;
    public void insert(Node node)
    {
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

    void printList()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }


    public static void main(String args[])
    {
        MergeList mlist1 = new MergeList();
        MergeList mlist2 = new MergeList();

        mlist1.insert(new Node(5));
        mlist1.insert(new Node(10));
        mlist1.insert(new Node(15));

        mlist2.insert(new Node(2));
        mlist2.insert(new Node(3));
        mlist2.insert(new Node(20));

        mlist1.head = new Gfg().sortedMerge(mlist1.head , mlist2.head);
        mlist1.printList();
    }
}

