class P23
{
    public static void main(String args[])
    {
        for(char x='A';x<='E';x++)
        {
            for(char y='E';y>=x;y--)
            {
                System.out.print(" ");
            }
            for(char y=x;y>='A';y--)
            {
                System.out.print(y);
            }
            System.out.println();
        }
    }
}