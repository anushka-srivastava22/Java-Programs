import java.util.Scanner;
class Armstrong
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entr a number");
        int n=sc.nextInt();
        int num=n;
        int sum=0;
        while (n!=0)
        {
            int d=n%10;
            sum=sum+(d*d*d);
            n=n/10;
        }
        if (num==sum)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not a Armstrong number");
        }
    }
}
