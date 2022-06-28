package entities;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Neighborhood {

    public Neighborhood() {}

    private final Set<Family> families = new HashSet<>();

    public void addFamily(Family family) {
        this.families.add(family);
    }

    public void addFamilies(Collection<Family> families) {
        this.families.addAll(families);
    }

    public void removeFamily(Family family) {
        this.families.remove(family);
    }

    public Set<Family> showFamilies() {
        return this.families;
    }
}
