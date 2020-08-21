import java.util.Scanner;
class HR1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter no. of test cases");
        int t=sc.nextInt();
        while(t!=0)
        {
            System.out.println("Enter value of a");
            int a=sc.nextInt();
            System.out.println("Enter value of b");
            int b = sc.nextInt();
            System.out.println("Enter value of n");
            int n=sc.nextInt();
            int x=0;
            for(int i=0 , j=0 ; j<n && i<=n-1 ; i++, j++)
            {
                x=(int)(Math.pow(2,i)*b)+x;
                System.out.print((a+x)+" ");
            }
            System.out.println();
            t--;
        }
    }
}
