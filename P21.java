class P21
{
    public static void main(String args[])
    {
        for(char x='E';x>='A';x--)
        {
            for(char y='E';y>=x;y--)
            {
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}