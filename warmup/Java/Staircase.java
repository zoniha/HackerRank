import java.io.*;

class Result {

    public static void staircase(int n) {
        int star = 1, space = n - 1;
        while (n > 0) {
            for (int i = 0; i < space; i++) {
                System.out.print(" ");
            }

            for (int i = 0; i < star; i++) {
                System.out.print("#");
            }

            star = star + 1;
            space = space - 1;
            --n;
            System.out.println("");
        }
    }

}


public class Staircase {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
