import exercise1.Basket;
import exercise1.Bouquet;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("apple","orange","mango","banana");
        System.out.println(basket.count());
        System.out.println(basket.customCount());
        System.out.println(basket.distinct());
        System.out.println(basket.position("mango"));

        Bouquet bouquet = new Bouquet();
        bouquet.add("Narcis");
        bouquet.add("Margaret");
        System.out.println(bouquet.getAll());
        bouquet.remove("Narcis");
    }
}
