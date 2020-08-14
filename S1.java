import java.util.Scanner;
class S1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of term");
        int n=sc.nextInt();
        System.out.println("Enter value of x");
        double x=sc.nextDouble();
        double sum=0;
        for(double i=1;i<=n;i++)
        {
            sum=sum+(x/i);
            System.out.print((x/i)+",");
        }
        System.out.println();
        System.out.println("Sum="+sum);
    }
}
            