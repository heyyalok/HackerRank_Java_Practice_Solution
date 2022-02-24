import java.util.Scanner;
public class JavaLoop2
{
    public static void main(String[]args)
    {
        Scanner scr = new Scanner(System.in);
        int t = scr.nextInt();
        for (int i=0; i<t; i++)
        { 
            int a = scr.nextInt();
            int b = scr.nextInt();
            int n = scr.nextInt();
            
               for (int j=0; j<n ;j++)
               {
                   a = a+ (int)Math.pow(2,j)*b;
                    System.out.print(a+" ");
                }
            System.out.println();
        }
        scr.close();
    }
}
