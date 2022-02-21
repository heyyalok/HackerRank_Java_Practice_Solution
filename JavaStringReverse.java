import java.util.Scanner;
public class JavaStringReverse {

    public static void main(String[]args)
    {
        Scanner scr = new Scanner(System.in);
        String name = scr.nextLine();
        String reverse = "";
        int length = name.length();
        for (int i = length-1; i>=0; i-- )
        {
            reverse = reverse + name.charAt(i);
        }
        if (name.equals(reverse))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
