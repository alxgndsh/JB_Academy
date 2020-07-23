import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long inp = scanner.nextLong();
        long i = 1, res = 1;
        boolean flag = false;
        while (!flag) {
            res *= i;
            i++;
            if (res > inp) flag = true;
        }
        System.out.println(i - 1);

    }
}