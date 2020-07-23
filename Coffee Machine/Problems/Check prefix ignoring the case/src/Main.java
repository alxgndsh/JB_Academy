import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        if (word.contains("j") || word.contains("J")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}