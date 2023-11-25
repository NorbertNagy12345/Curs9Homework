import exercise1.Basket;
import exercise1.Bouquet;
import exercise1.Company;
import exercise1.Person;

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

        Company company = new Company();
        company.employ(new Person("Alex",23,"Worker"));
        System.out.println(company.getPersons("Worker"));
    }
}
