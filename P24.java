import java.util.Scanner;
class P24
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter no. of terms");
        int n=sc.nextInt();
        for(int x=n;x>=1;x--)
        {
            for(int y=1;y<=x;y++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}