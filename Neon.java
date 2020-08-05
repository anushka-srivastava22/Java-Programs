import java.util.Scanner;
class Neon
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int s=n*n;
        int sum=0;
        while(s>0)
        {
            int d=s%10;
            sum+=d;
            s=s/10;
        }
        if(n==sum)
        {
            System.out.println("Neon number");
        }
        else
        {
            System.out.println("Not a neon number");
        }
    }
}