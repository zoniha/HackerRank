import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if (n % 2 != 0 || (6 <= n && n <= 20)) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }
    }
}
