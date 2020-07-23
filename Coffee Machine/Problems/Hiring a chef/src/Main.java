import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        String trash1 = scanner.next();
        String trash2 = scanner.next();
        String trash3 = scanner.next();
        String dish = scanner.next();

        System.out.println("The form for " + name + " is completed. We will contact you if we need a chef that cooks " + dish + " dishes.");
    }
}
