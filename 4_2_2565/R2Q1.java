import java.util.*;

public class S2Q1_64010001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input size of matrix: ");
        int n = in.nextInt();
        if (n > 2) {
            int[][] a = new int[n][n];
            int max = 0;
            int imax = 0;
            int jmax = 0;
            System.out.println("Random matrix: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = (int) (Math.random() * 10);
                    if (a[i][j] > max) {
                        max = a[i][j];
                        imax = i;
                        jmax = j;
                    }
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("The first found largest member is: " + max + " at(" + imax + "," + jmax + ")");

            // (a)
            System.out.print("(a) Members on Top: ");
            boolean flag = true;
            for (int i = imax - 1; i >= 0; i--) {
                flag = false;
                System.out.print(a[i][jmax]);
                if (i != 0)
                    System.out.print(",");
            }
            if (flag)
                System.out.println("NO");
            else
                System.out.println();

            // (b)
            System.out.print("(b) Members on the Right Hand Side: ");
            flag = true;
            for (int j = jmax + 1; j < n; j++) {
                flag = false;
                System.out.print(a[imax][j]);
                if (j != n - 1)
                    System.out.print(",");
            }
            if (flag)
                System.out.println("NO");
            else
                System.out.println();

            // (c)
            System.out.print("(c) Members at the Bottom: ");
            flag = true;
            for (int i = imax + 1; i < n; i++) {
                flag = false;
                System.out.print(a[i][jmax]);
                if (i != n - 1)
                    System.out.print(",");
            }
            if (flag)
                System.out.println("NO");
            else
                System.out.println();

            // (d)
            System.out.print("(d) Members on the Left Hand Side: ");
            flag = true;
            for (int j = jmax - 1; j >= 0; j--) {
                flag = false;
                System.out.print(a[imax][j]);
                if (j != 0)
                    System.out.print(",");
            }
            if (flag)
                System.out.println("NO");
            else
                System.out.println();
            System.out.println("End of program.");
        } else {
            System.out.println("Error::Cannot Make the matrix, Size can be 3 or more");
        }
        in.close();
    }
}
