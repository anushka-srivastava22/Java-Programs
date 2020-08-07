import java.util.Scanner;
class P4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n=sc.nextInt();
        for(int x=1;x<=n;x++)
        {
            for(int y=x;y>=1;y--)
            {
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}