import java.util.*;

public class JavaStdinandStdoutI {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while (scn.hasNextInt()) {
            int n = scn.nextInt();
            System.out.println(n);
        }
        scn.close();
    }
}
