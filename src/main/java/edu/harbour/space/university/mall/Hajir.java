


import java.util.Scanner;


interface Payment {
    void pay(double amount);
}


class Mastercard implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via Mastercard.");
    }
}


class PayPal implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via PayPal.");
    }
}


class Cash implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " in cash.");
    }
}


class Revolut implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via Revolut.");
    }
}


public class ShoppingMall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Payment mastercard = new Mastercard();
        Payment paypal = new PayPal();
        Payment cash = new Cash();
        Payment revolut = new Revolut();

        
        System.out.println("Welcome to the Shopping Mall!");
        System.out.print("Enter the total amount to pay: ");
        double amount = scanner.nextDouble();
        scanner.close();

        
        System.out.println("Choose payment method:");
        System.out.println("1. Mastercard");
        System.out.println("2. PayPal");
        System.out.println("3. Cash");
        System.out.println("4. Revolut");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        
        switch (choice) {
            case 1:
                mastercard.pay(amount);
                break;
            case 2:
                paypal.pay(amount);
                break;
            case 3:
                cash.pay(amount);
                break;
            case 4:
                revolut.pay(amount);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}