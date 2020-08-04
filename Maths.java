import java.util.Scanner;
class Maths
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of test cases");
        int n=sc.nextInt();
        for (int x=1;x<=n;x++)
        {
            System.out.println("Enter number");
            int num=sc.nextInt();
            if(num<=1000)
            {
                int s=num*num;
                int c=num*num*num;
                double srt=Math.sqrt(num);
                double crt=Math.cbrt(num);
                System.out.println(s+"\t"+c+"\t"+srt+"\t"+crt);
            }
            else
            {
                System.out.println("Out of bound");
            }
        }
    }
}
