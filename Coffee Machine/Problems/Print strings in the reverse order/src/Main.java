import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] word = new String[3];

        for (int i = 0; i < 3; i++) {
            word[i] = scanner.next();
        }

        for (int i = 2; i > -1; i--) {
            System.out.println(word[i]);
        }
    }
}
