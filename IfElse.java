import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scr = new Scanner (System.in);
        byte n = scr.nextByte();
        if (n % 2!= 0){
            System.out.println("Weird");
        }
        if (n % 2 == 0 && n>=2 && n<=5){
            System.out.println("Not Weird");
        }
        if (n % 2 == 0 && n>=6 && n<=20){
            System.out.println("Weird");
        }
        if (n % 2 == 0 && n> 20){
            System.out.println("Not Weird");
        }
    }
}
