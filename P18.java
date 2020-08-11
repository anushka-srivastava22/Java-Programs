class P18
{
    public static void main(String args[])
    {
        for(int x=5;x>=1;x--)
        {
            for(int y=1;y<x;y++)
            {
                System.out.print(" ");
            }
            for(int y=x;y<=5;y++)
            {
                System.out.print(y);
            }
            System.out.println();
        }
    }
}