import java.util.Scanner;
class Geometry
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter \n 1-Area \n 2-Volume");
        int op=sc.nextInt();
        switch(op)
        {
            case 1: System.out.println("Enter \n 1-Square \n 2-Rectangle \n 3-Circle");
            int ch1=sc.nextInt();
            switch (ch1)
            {
                case 1: System.out.println("Enter side");
                int s=sc.nextInt();
                int a1=s*s;
                System.out.println("Area of square ="+a1);
                break;

                case 2:System.out.println("Entr length");
                int l=sc.nextInt();
                System.out.println("Entr breadth");
                int b=sc.nextInt();
                int a2=l*b;
                System.out.println("Area of Reactangle ="+a2);
                break;

                case 3: System.out.println("Enter radius");
                int r=sc.nextInt();
                double a3=3.14*r*r;
                System.out.println(" Area of Circle"+a3);
                break;

                default: System.out.println("Invalid Input");
                break;
            }
            break;

            case 2:System.out.println("Enter \n 1-Cube \n 2-Cuboid \n 3-Sphere");
            int ch2=sc.nextInt();
            switch (ch2)
            {
                case 1:System.out.println("Enter side");
                int s=sc.nextInt();
                int v1=s*s*s; 
                System.out.println("Volume of cube = "+v1);
                break;

                case 2:System.out.println("Enter length");
                int l=sc.nextInt();
                System.out.println("Enter breadth");
                int b=sc.nextInt();
                System.out.println("Enter height");
                int h=sc.nextInt();
                int v2=l*b*h;
                System.out.println("Volume of cuboid = "+v2);
                break;

                case 3: System.out.println("Enter radius");
                int r=sc.nextInt();
                double v3=(4*3.14*r*r*r)/3;
                System.out.println("Volume of sphere = "+v3);
                break;


                default:System.out.println("Invalid Input");
                break;

            }
            break;
                
            default:System.out.println("Invalid Input");
            break;
        }
    }
}        
                    
                    
                    
                    
                    
                    
                    
                    
                    
                
                
                
                
                    