import java.io.*;
import java.util.*;
public class Solution 
{
    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in);
        String A=sc.next().toLowerCase();
        String B=sc.next().toLowerCase();
        /* Enter your code here. Print output to STDOUT. */
        int n = A.length()+B.length();
        System.out.println(n);
         if (A.compareTo(B)<0)
        {
            System.out.println("No");
        }
        else if (A.compareTo(B)==0)
        {
            System.out.println("No");
        }
        else
        {
            System.out.println("Yes");
        }
        String A1= A.substring(0,1).toUpperCase();
        String B1= B.substring(0,1).toUpperCase();
        //System.out.println(A1+" "+B1);
        String A3 = A.substring(1);
        String B3 = B.substring(1);
        //System.out.println(A3+" "+B3);
        String A4 = A1+A3;
        String B4 = B1+B3;
        System.out.println(A4+" "+B4);
    }
}
