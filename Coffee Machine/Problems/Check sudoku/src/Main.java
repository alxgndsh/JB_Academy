import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int nn = n * n;
        boolean f = true;
        int[][] sudoku = new int[nn][nn];
        for (int i = 0; i < nn; i++) {
            for (int j = 0; j < nn; j++) {
                sudoku[i][j] = scanner.nextInt();
                if (sudoku)
            }
        }
        int[][] square = new int[n][n];
        boolean flag = true;
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < nn; i++) {
                for (int j = 0; j < n; j++) {
                    square[i % n][j] = sudoku[i][j + k * n];
                }
                if (i % n == n - 1) {
                    if (!check(square, n)) {
                        flag = false;
                    }
                }
            }
        }
        if (flag) System.out.println("YES");
        else System.out.println("NO");
    }

    static boolean check(int[][] square, int n) {
        boolean[] arr = new boolean[n * n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[square[i][j] - 1] = true;
            }
        }
        for (int i = 0; i < n * n; i++) {
            if (!arr[i]) return false;
        }
        return true;
    }
}