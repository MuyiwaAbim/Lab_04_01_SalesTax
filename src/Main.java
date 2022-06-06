public class Main {
    static double salesTax = 1.05;
    static int originalPrice = 20;
    static double totalPrice = 25;

    public static void main (String [] args)
    {
        double totalPrice = salesTax * originalPrice;
        System.out.println("The sales tax is 5%, and your total is " + totalPrice + " dollars");

    }
}
