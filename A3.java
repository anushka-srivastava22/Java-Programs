import java.util.Scanner;
class A3
{
    public static void main(String args[])
    {
        String name[]=new String [5];
        int marks[]=new int [5];
        for(int x=0;x<=4;x++)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter name");
            name[x]=sc.nextLine();
            System.out.println("Enter marks");
            marks[x]=sc.nextInt();
        }
        int topper_marks=marks[0];
        String topper_name=name[0];
        for(int x=1;x<=4;x++)
        {
            if(topper_marks<marks[x])
            {
                topper_marks=marks[x];
                topper_name=name[x];
            }
        }
        System.out.println("Topper is "+topper_name);
    }
}
            