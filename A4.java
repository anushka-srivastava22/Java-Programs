import java.util.Scanner;
class A4
{
    public static void main(String args[])
    {
        int A[]=new int[5];
        int B[]=new int[5];
        int S[]=new int[5];
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter numbers in Array 1");
        for(int x=0;x<=4;x++)
        {
            System.out.println("Entr number");
            A[x]=sc.nextInt();
        }
        System.out.println("Enter numbers in Array 2");
        for(int x=0;x<=4;x++)
        {
            System.out.println("Entr number");
            B[x]=sc.nextInt();
        }
        /*for(int x=0;x<=4;x++)
        {
            S[x]=A[x]+B[x];
        }*/
        for(int x=0;x<=4;x++)
        {
            System.out.println(A[x]+" + "+B[x]+" = "+(A[x]+B[x]));
        }
    }
}