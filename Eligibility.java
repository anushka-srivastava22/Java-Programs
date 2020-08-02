import java.io.*;
class Eligibility
{
    public static void main (String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (isr);
        System.out.println("Enter your name");
        String name=br.readLine();
        System.out.println("Enter your city");
        String city=br.readLine();
        System.out.println("Have you passed class 12th ?");
        System.out.println("Yes or No");
        String pass=br.readLine();
        System.out.println("Did you study in Uttar Pradesh");
        System.out.println("Yes or No");
        String std=br.readLine();
        char ch=name.charAt(0);
        if (ch=='A'||ch=='a')
        {
            if(city.equalsIgnoreCase("Allahabad"))
            {
                if(pass.equalsIgnoreCase("Yes"))
                {
                    if(std.equalsIgnoreCase("Yes"))
                    {
                        System.out.println("You are Eligible");
                    }
                    else
                    { 

                        System.out.println("You are Not Eligible");
                    }

                }
                else
                {
                    System.out.println("You are Not Eligible");
                }

            }
            else
            {
                System.out.println("You are Not Eligible");
            }

        }
        else
        {
            System.out.println("You are Not Eligible");
        }

    }
}