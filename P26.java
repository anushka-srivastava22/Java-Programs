class P26
{
    public static void main(String args[])
    {
        for(int x=1;x<=5;x++)
        {
            for(int y=x;y<=4;y++)
            {
                System.out.print(" ");
            }
            
            for(int z=1;z<=x;z++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int x=5;x>=1;x--)
        {
            for(int y=x;y<=5;y++)
            {
                System.out.print(" ");
            }
            
            for(int z=1;z<x;z++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}