import services.BankServiceService;
import services.IBankService;
import services.NotFoundException_Exception;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Client {

    // Method to allow user to choose a valid currency
    static String choisirCurrency(Set<String> currencySet, Scanner scanner) {
        System.out.println("Choisissez une devise :");
        System.out.println(currencySet);
        String chosenCurrency = scanner.next().toUpperCase();

        // Loop until a valid currency is chosen
        while (!currencySet.contains(chosenCurrency)) {
            System.out.println("Devise non valide. Veuillez choisir parmi les options :");
            System.out.println(currencySet);
            chosenCurrency = scanner.next().toUpperCase();
        }
        return chosenCurrency;
    }

    // Method to get the amount from the user
    static double askForAmount(Scanner scanner) {
        System.out.print("Entrez le montant : ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Veuillez entrer un montant valide.");
            scanner.next(); // Consume the invalid input
        }
        return scanner.nextDouble();
    }

    // Method to display the menu options
    static void displayMenu() {
        System.out.println("\n--- Menu ---");
        System.out.println("1. Convertir Euro à TND");
        System.out.println("2. Convertir TND à autre devise");
        System.out.println("3. Quitter");
        System.out.print("Choisissez une option : ");
    }

    public static void main(String[] args) {
        // Get the proxy for the BankService
        IBankService proxy = new BankServiceService().getBankServicePort();

        // Retrieve all available currencies
        Set<String> currencies = new HashSet<>(proxy.getAllCurrencies());

        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        while (option != 3) {
            // Display the options menu
            displayMenu();
            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
            } else {
                System.out.println("Veuillez entrer un nombre valide.");
                scanner.next(); // Consume invalid input
                continue;
            }

            switch (option) {
                case 1:
                    // Convert Euro to TND
                    System.out.println("Convertir Euro à TND");
                    double euroAmount = askForAmount(scanner);
                    System.out.println(euroAmount + " Euros en TND : " + proxy.convertEuroToTnd(euroAmount));
                    break;

                case 2:
                    // Convert TND to another currency
                    System.out.println("Convertir TND à autre devise");
                    double tndAmount = askForAmount(scanner);
                    String chosenCurrency = choisirCurrency(currencies, scanner);
                    double convertedAmount = 0;
                    try {
                        convertedAmount = proxy.convertTndToAny(tndAmount, chosenCurrency);
                    } catch (NotFoundException_Exception e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(tndAmount + " TND en " + chosenCurrency + " : " + convertedAmount);
                    break;

                case 3:
                    // Exit
                    System.out.println("Quitter le programme.");
                    break;

                default:
                    System.out.println("Option non valide, veuillez choisir une option valide.");
            }
        }

        // Close the scanner resource
        scanner.close();
    }
}
