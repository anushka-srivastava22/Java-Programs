import java.io.*;
class Reverse
{
    public static void main (String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (isr);
        System.out.println("Enter any number");
        int n=Integer.parseInt(br.readLine());
        int rev=0;
        while(n!=0)
        {
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        System.out.println("Reverse Number =" +rev);
    }
}
