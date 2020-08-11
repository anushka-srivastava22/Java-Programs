class P19
{
    public static void main (String args[])
    {
        for(int x=1;x<=5;x++)
        {
            
            for(int y=x;y<=4;y++)
            {
                System.out.print(" ");
            }
            
            for(int y=x;y>=1;y--)
            {
                System.out.print(y);
            }
            
            System.out.println();
        }
    }
}