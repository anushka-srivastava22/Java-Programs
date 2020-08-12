class P25
{
    public static void main(String args[])
    {
        for(int x=1;x<=6;x++)
        {
            for(int y=1;y<=x;y++)
            {
                System.out.print(" ");
            }
            for(int y=1;y<=6-x;y++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}