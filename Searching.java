import java.util.Scanner;
class Searching
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        System.out.println("Enter a word to be searched");
        String word=sc.nextLine();
        int l=s.length();
        int n=word.length();
        int counter=0;
        for(int i=0; i<=l-n; i++)
        {
            String s1=s.substring(i,i+n);
            if(word.equalsIgnoreCase(s1))
            {
                counter++;
            }
        }
        System.out.println(word+" is present "+counter+" times.");
    }
}
       