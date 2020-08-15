import java.util.Scanner;
class Special
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int sum=0;
        int num=n;
        int fact=1;
        while(n>0)
        {
            int d=n%10;
            n=n/10;
            for (int x=1;x<=d;x++)
            {
                fact=fact*x;
            }
            sum=sum+fact;
            fact=1;
        }
        if (sum==num)
        {
            System.out.println("Special Number");
        }
        else
        {
            System.out.println("Not a Special Number");
        }
    }
}