import java.io.*;
class Perfect
{
    public static void main (String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Entr number");
        int n=Integer.parseInt(br.readLine());
        int num=n;
        int sum=0;
        for (int x=1;x<n;x++)
        {
            
            if(n%x==0)
            {
                sum=sum+x;
            }
        }
        if(num==sum)
        {
            System.out.println("It is a perfect number");
        }
        else
        {
            System.out.println("It is not a perfect number");
        }
    }
}
        
        
        
            