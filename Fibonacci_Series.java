import java.util.Scanner;
class Fibonacci_Series
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter no. of terms");
        int n=sc.nextInt();
        int a=0;
        int b=0;
        int c=1;
        System.out.print("Fibonacci Series : ");
        System.out.print(a+",");
        System.out.print(b+",");
        
        for(int x=1;x<=n;x++)
        {
            a=b;
            b=c;
            c=a+b;
            System.out.print(c+",");
        }
    }
}