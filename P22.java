class P22
{
    public static void main(String args[])
    {
        for (char x='E';x>='A';x--)
        {
            
            for(char y='A';y<x;y++)
            {
                System.out.print(" ");
            }
            
            for(char y=x;y<='E';y++)
            {
                System.out.print(y);
            }
            
            System.out.println();
        }
    }
}