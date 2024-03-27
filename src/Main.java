import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the pizza ordering system!");
        System.out.println("Choose your pizza type:");
        System.out.println("1. Regular Pizza");
        System.out.println("2. Deluxe Pizza");
        System.out.print("Enter your choice (1/2): ");
        int choice = getIntInput(scanner);

        if (choice == 1) {
            System.out.println("Regular Pizza selected.");
            System.out.print("Is the pizza vegetarian? (yes/no): ");
            boolean isVegetarian = getBooleanInput(scanner);

            // Base Pizza
            Pizza basePizza = new Pizza(isVegetarian);

            System.out.print("Would you like to add extra toppings? (yes/no): ");
            boolean addExtraToppings = getBooleanInput(scanner);
            if (addExtraToppings) {
                basePizza.addExtraToppings();
            }

            System.out.print("Would you like to add extra cheese? (yes/no): ");
            boolean addExtraCheese = getBooleanInput(scanner);
            if (addExtraCheese) {
                basePizza.addExtraCheese();
            }

            System.out.print("Would you like to take it away? (yes/no): ");
            boolean takeAway = getBooleanInput(scanner);
            if (takeAway) {
                basePizza.AddTakeAway();
            }

            basePizza.getBill();
        } else if (choice == 2) {
            System.out.println("Deluxe Pizza selected.");
            System.out.print("Is the deluxe pizza vegetarian? (yes/no): ");
            boolean isDeluxeVegetarian = getBooleanInput(scanner);

            // Deluxe Pizza
            DeluxPizza deluxePizza = new DeluxPizza(isDeluxeVegetarian);
            deluxePizza.getBill();
        } else {
            System.out.println("Invalid choice. Please choose 1 for Regular Pizza or 2 for Deluxe Pizza.");
        }

        scanner.close();
    }

    private static int getIntInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // consume invalid input
        }
        return scanner.nextInt();
    }

    private static boolean getBooleanInput(Scanner scanner) {
        while (true) {
            String input = scanner.next().toLowerCase();
            if (input.equals("yes")) {
                return true;
            } else if (input.equals("no")) {
                return false;
            } else {
                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            }
        }
    }
}
