import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int c = 1;
        while(sc.hasNext()){
            String Str = sc.nextLine();
            System.out.println(c + " " + Str);
            c++;
        }     
    }
}