import java.util.*;

public class R3Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input size of matrix: ");
        int n = in.nextInt();
        if (n > 4) {
            int[][] a = new int[n][n];
            System.out.println("Random matrix: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = (int) (Math.random() * 5);
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }

            System.out.print("Please input value of Row and column: ");
            int imax = in.nextInt();
            int jmax = in.nextInt();
            System.out.println("The selected member is "+a[imax][jmax]);

            // (i)
            System.out.print("(i) Products of all Members on Top: ");
            boolean flag = true;
            int sum = 1;
            for (int i = imax - 1; i >= 0; i--) {
                flag = false;
                sum *= a[i][jmax];
            }
            if (flag)
                System.out.println("NO");
            else
                System.out.println(sum);

            // (ii)
            System.out.print("(ii) Products of all Members on the Right Hand Side: ");
            flag = true;
            sum = 1;
            for (int j = jmax + 1; j < n; j++) {
                flag = false;
                sum *= a[imax][j];
            }
            if (flag)
                System.out.println("NO");
            else
                System.out.println(sum);

            // (iii)
            System.out.print("(iii) Products of all Members at the Bottom: ");
            flag = true;
            sum = 1;
            for (int i = imax + 1; i < n; i++) {
                flag = false;
                sum*=a[i][jmax];
            }
            if (flag)
                System.out.println("NO");
            else
                System.out.println(sum);

            // (iv)
            System.out.print("(iv) Products of all Members on the Left Hand Side: ");
            flag = true;
            sum = 1;
            for (int j = jmax - 1; j >= 0; j--) {
                flag = false;
                sum=a[imax][j];
            }
            if (flag)
                System.out.println("NO");
            else
                System.out.println(sum);
            System.out.println("End of program.");
        } else {
            System.out.println("Error::Cannot Make the matrix, Size can be 3 or more");
        }
        in.close();
    }
}
