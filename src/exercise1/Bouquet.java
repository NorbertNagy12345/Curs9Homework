package exercise1;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Bouquet {
    private Set<String> flowers;

    public Bouquet() {
        flowers = new HashSet<>();
    }

    public Collection<String> getAll() {
        return flowers;
    }

    public void add(String flower) {
        flowers.add(flower);
    }

    public void remove(String flower) {
        flowers.remove(flower);
    }
}
