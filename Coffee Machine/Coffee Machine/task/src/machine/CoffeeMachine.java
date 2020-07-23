package machine;

import java.util.Scanner;

public class CoffeeMachine {

    private static int water = 400;
    private static int milk = 540;
    private static int beans = 120;
    private static int cups = 9;
    private static int money = 550;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String action = scanner.next();
        System.out.println();
        while (!action.equals("exit")) {
            switch (action) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                    String choice = scanner.next();
                    if (choice.equals("back")) {
                        System.out.println("Write action (buy, fill, take, remaining, exit):");
                        action = scanner.next();
                        System.out.println();
                        continue;
                    } else {
                        buyCoffee(Integer.parseInt(choice));
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water do you want to add:");
                    water += scanner.nextInt();
                    System.out.println("Write how many ml of milk do you want to add:");
                    milk += scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    beans += scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    cups += scanner.nextInt();
                    break;
                case "take":
                    System.out.println("I gave you $" + money);
                    money = 0;
                    break;
                case "remaining":
                    machineStatus();
                    break;
            }
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            action = scanner.next();
            System.out.println();
        }
    }

    private static void buyCoffee(int choice) {
        String reason = "";
        if (choice == 1) {
            if (cups < 1) {
                reason = "disposable cups!";
            }
            if (beans < 16) {
                reason = "coffee beans!";
            }
            if (water < 250) {
                reason = "water!";
            }
            if (!reason.equals("")) {
                System.out.println("Sorry, not enough " + reason);
            } else {
                water -= 250;
                beans -= 16;
                cups -= 1;
                money += 4;
            }
            System.out.println();
        }

        if (choice == 2) {
            if (cups < 1) {
                reason = "disposable cups!";
            }
            if (beans < 20) {
                reason = "coffee beans!";
            }
            if (milk < 75) {
                reason = "milk!";
            }
            if (water < 350) {
                reason = "water!";
            }
            if (!reason.equals("")) {
                System.out.println("Sorry, not enough " + reason);
            } else {
                water -= 350;
                milk -= 75;
                beans -= 20;
                cups -= 1;
                money += 7;
            }
            System.out.println();
        }

        if (choice == 3) {
            if (cups < 1) {
                reason = "disposable cups!";
            }
            if (beans < 12) {
                reason = "coffee beans!";
            }
            if (milk < 100) {
                reason = "milk!";
            }
            if (water < 200) {
                reason = "water!";
            }
            if (!reason.equals("")) {
                System.out.println("Sorry, not enough " + reason);
            } else {
                water -= 200;
                milk -= 100;
                beans -= 12;
                cups -= 1;
                money += 6;
                System.out.println("I have enough resources, making you a coffee!");
            }
            System.out.println();
        }
    }

    private static void machineStatus() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println("$" + money + " of money");
    }
}
