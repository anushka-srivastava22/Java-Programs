import java.io.*;
class Prime
{
    public static void main(String args[]) throws IOException 
    {
        InputStreamReader isr=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (isr);
        System.out.println("Enter any number");
        int n=Integer.parseInt(br.readLine());
        int count=0;
        int t=n;
        for (int x=2;x<=n/2;x++)
        {
            if (n%x==0)
            {
                count++;
            }
        }
        if (count==0)
        {
            System.out.println(t+" is a prime number");
        }
        else
        {
            System.out.println(t+" is not a prime number");
        }
    }
}
          