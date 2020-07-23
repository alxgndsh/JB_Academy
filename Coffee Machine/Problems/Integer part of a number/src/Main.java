import java.util.Scanner;

public class Main {

    public static int extractInt(double d) {
        return ((int)d);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final double d = scanner.nextDouble();
        System.out.println(extractInt(d));
    }
    char[] array = { 'a', 'b', 'c', 'd' };

    char[] array1 = new char[0];

    char[] array2 = new char[1];

    char[] array3 = new char[10000000000000];

    char[] array4 = new char[-1];
}
