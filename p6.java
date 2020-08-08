class p6
{
    public static void main(String args[])
    {
        for(int x=1;x<=5;x++)
        {
            int num;
            if(x%2==0)
            {
                num=0;
                for(int y=1;y<=5;y++)
                {
                    System.out.print(num+" ");
                    num=(num==0)?1:0;
                }
            }
            else
            {
                num=1;
                for(int y=1;y<=5;y++)
                {
                    System.out.print(num+" ");
                    num=(num==0)?1:0;
                }
            }
            System.out.println();
        }
    }
}
                
