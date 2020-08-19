import java.util.Scanner;
class File
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        int i1=s.lastIndexOf("\\");
        int i2=s.lastIndexOf(".");
        System.out.println("Path : "+s.substring(0,i1));
        System.out.println("File Name : "+s.substring(i1+1,i2));
        System.out.println("Extension : "+s.substring(i2+1));
    }
}