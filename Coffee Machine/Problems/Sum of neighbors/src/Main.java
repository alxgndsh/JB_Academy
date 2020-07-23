import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arguments = new ArrayList<>();
        int weight = 0;
        String line = scanner.nextLine();
        while (!line.equals("end")) {
            weight = 0;
            for (String number : line.split(" ")) {
                arguments.add(Integer.parseInt(number));
                weight++;
            }
            line = scanner.nextLine();
        }
        int row = weight + 2;
        int str = arguments.size() / weight + 2;
        int[][] res = new int[str][row];
        int index = 0;
        for (int i = 1; i < str - 1; i++) {
            for (int j = 1; j < row - 1; j++) {
                res[i][j] = arguments.get(index++);
            }
        }

        for (int i = 1; i < str - 1; i++) {
            res[i][0] = res[i][row - 2];
            res[i][row - 1] = res[i][1];
        }
        for (int j = 1; j < row - 1; j++) {
            res[0][j] = res[str - 2][j];
            res[str - 1][j] = res[1][j];
        }

        for (int i = 1; i < str - 1; i++) {
            for (int j = 1; j < row - 1; j++) {
                System.out.print((res[i + 1][j] + res[i - 1][j] + res[i][j + 1] + res[i][j - 1]) + " ");
            }
            System.out.println();
        }
    }
}