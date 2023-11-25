package exercise1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Basket {
    private List<String> fruits;
    public Basket(){
        fruits =new ArrayList<>();
    }

    public boolean find (String fruit){
        return fruits.contains(fruit);
    }
    public boolean remove(String fruit) {
        return fruits.remove(fruit);
    }

    public int position(String fruit) {
        return fruits.indexOf(fruit);
    }

    public Collection<String> distinct() {
        return new ArrayList<>(new HashSet<>(fruits));
    }

    public void add(String fruit) {
        fruits.add(fruit);
    }
    public void add(String fruit1,String fruit2,String fruit3,String fruit4){
        fruits.add(fruit1);
        fruits.add(fruit2);
        fruits.add(fruit3);
        fruits.add(fruit4);


    }

    public int count() {
        return fruits.size();
    }

    public int customCount() {
        int count = 0;
        for (String fruit : fruits) {
            count++;
        }
        return count;
    }

}
