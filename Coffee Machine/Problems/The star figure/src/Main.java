import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(check(i, j, n) + " ");
            }
            System.out.println();
        }
    }
    public static char check(int i, int j, int n) {
        if ((i == j) || (i == n - j - 1) || (i == n / 2) || (j == n / 2)) return '*';
        else return '.';
    }
}