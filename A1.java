import java.util.Scanner;
class A1
{
    public static void main (String args[])
    {
        int n[]=new int[5];
        for(int x=0;x<=4;x++)
        {
            Scanner sc=new Scanner (System.in);
            System.out.println("Enter a number");
            n[x]=sc.nextInt();
        }
        for(int x=4;x>=0;x--)
        {
            System.out.print(n[x]+" ");
        }
    }
}