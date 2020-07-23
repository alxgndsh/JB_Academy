import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();
        if (word1.replaceAll("\\s+","").equals(word2.replaceAll("\\s+",""))){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}