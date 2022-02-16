package JavaPractice;

import java.util.Scanner;
public class java_output_formating
{
    public static void main(String[] args)
    {
        Scanner scr = new Scanner(System.in);
        System.out.println("================================");
        for (int i=0; i<3; i++)
        {
            String languages = scr.next();
            int values = scr.nextInt();
            System.out.printf("%-15s%03d\n",languages,values);
        }
        System.out.println("================================");
    }
}
