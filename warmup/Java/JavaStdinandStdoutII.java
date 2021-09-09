import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        double m = scn.nextDouble();
        scn.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String text = scn.nextLine();

        System.out.println("String: " + text);
        System.out.println("Double: " + m);
        System.out.println("Int: " + n);
    }
}
