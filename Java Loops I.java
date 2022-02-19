import java.util.Scanner;
public class Multiplicationtable
{
    public static void main(String[]args)
    {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        for (int i=1; i<=10;i++)
        {
            System.out.println(n+" x "+i+" = "+(n*i));
        }
    }
}
