package Mall;
import Mall.Payment.Cash;
import Mall.Payment.PaymentMethod;


public class Main {

    public static void main(String[] args) {


        Mall mall = new Mall("Socco");

        Customer jack = new Customer("Jack");

        Item basketBall = new Item(1, "BasketBall", 19.99);

        ShoppingCart shoppingCart1 = new ShoppingCart(1);

        PaymentMethod cashPayment = new Cash();

        jack.enterMall(mall);

        jack.retrieveShoppingCart(shoppingCart1);

        jack.addItem(shoppingCart1, basketBall);

        shoppingCart1.show();

        CheckoutService checkoutService = new CheckoutService();
        checkoutService.checkout(jack, cashPayment);


        mall.show();


    }
}
