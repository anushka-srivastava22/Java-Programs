class Rank extends Record
{
    int index;
    Rank(String)
    {
        super();
        index=0;
    }
    public void highest ()
    {
        for(int x=0;x<=2;x++)
        {
            if(rank[x]<rank[x+1])
            {
                index=x;
            }
        }
    }
    public void display()
    {
        super.display();
        System.out.println("Topper = "+name[index]);
    }
}