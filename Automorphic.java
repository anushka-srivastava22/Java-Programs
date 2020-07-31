import java.io.*;
class Automorphic
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (isr);
        System.out.println("Enter any number");
        int n=Integer.parseInt(br.readLine());
        int sq=n*n;
        int num=n;
        int count=1;
        while(n!=0)
        {
            
            count=count*10;
            n=n/10;
        }
        if(sq%count==num)
        {
            System.out.println("Automorphic Number");
        }
        else
        {
            System.out.println("Not a Automorphic Number");
        }
    }
}
            