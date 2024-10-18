import services.BankService;
import services.BankServiceService;
import services.NotFoundExepetion_Exception;

import java.util.*;

public class Client {
    static String choisireCurrency(Set<String> currencySet){
        System.out.println("Choisire un currency :");
        System.out.println(currencySet);
        Scanner scanner = new Scanner(System.in);
        String choisire = scanner.next().toUpperCase();
        while (!currencySet.contains(choisire)){
            System.out.println("Choisire un currency :");
            System.out.println(currencySet);
            choisire = scanner.next().toUpperCase();
        }
        return choisire;
    }

    static double askForAmount(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donner le montant : ");
        double amount = scanner.nextDouble();
        return amount;
    }

    public static void main(String[] args) {
        BankService proxy = new BankServiceService().getBankServicePort();
        System.out.println(proxy.convEuroToTnd(300));
        Set<String> currencys = new HashSet<String>();
        for(String currency : proxy.getAllCurrency()) {
            currencys.add(currency);
        }


        try {
            double m = proxy.convTndToAny(askForAmount(),choisireCurrency(currencys));
            System.out.println(m + " Tnd");
        } catch (NotFoundExepetion_Exception e) {
            throw new RuntimeException(e);
        }


    }
}
