import java.util.*;

public class R1Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input size of matrix: ");
        int n = in.nextInt();
        if (n > 3) {
            int[][] a = new int[n][n];
            System.out.println("Random matrix: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = (int) (Math.random() * 10);
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }

            System.out.print("Please input value of Row and column: ");
            int imax = in.nextInt();
            int jmax = in.nextInt();
            System.out.println("The selected member is "+a[imax][jmax]);

            // (i)
            System.out.print("(i) Members on Top: ");
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

            // (ii)
            System.out.print("(ii) Members on the Right Hand Side: ");
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

            // (iii)
            System.out.print("(iii) Members at the Bottom: ");
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

            // (iv)
            System.out.print("(iv) Members on the Left Hand Side: ");
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
