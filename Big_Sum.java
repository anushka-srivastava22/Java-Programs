import java.util.Scanner;
class Big_Sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int big_sum=0;
        int num=0;
        for(int x=1;x<=10;x++)
        {
            System.out.println("Entr a number");
            int n=sc.nextInt();
            int sum=0;

            for(int a=x;a!=0;a++)
            {
                int d=a%10;
                sum=sum+d;

                if(sum>big_sum)
                {
                    big_sum=sum;
                    num=x;
                }

                sum=0;
            }
        }
        System.out.println(num);
    }
}
