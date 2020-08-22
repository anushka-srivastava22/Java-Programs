import java.util.Scanner;
class HR2
{
    public static String getSmallestAndLargest(String s , int k)
    {
        String smallest = "";
        String largest = "";
        String st[] = new String [s.length()-k+1];
        for(int i=0; i<=s.length()-k;i++)
        {
            String str = s.substring(i , i+k);
            st[i]=str;
        }
        smallest = st[0];
        largest = st[0];
        for(int i=0; i<st.length; i++)
        {
            if(st[i].compareTo(smallest)<0)
            {
                smallest = st[i];
            }
            else if(st[i].compareTo(largest)>0)
            {
                largest = st[i];
            }
        }
        return smallest+ "\n" +largest;
    }
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}