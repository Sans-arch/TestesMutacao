package entities;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {

    private final Set<Person> members = new HashSet<>();

    @Test
    void addMember() {
        Person p1 = new Person("Matheus", 20, 65.4, 1.63);
        Person p2 = new Person("José", 40, 85.4, 1.95);
        Person p3 = new Person("Paulinha", 27, 55.4, 1.56);

        this.members.add(p1);
        this.members.add(p2);
        this.members.add(p3);

        assertEquals(3, members.size());
    }

    @Test
    void removeMember() {
        Person p1 = new Person("Matheus", 20, 65.4, 1.63);
        this.members.add(p1);

        this.members.remove(p1);
        assertFalse(members.contains(p1));
    }
}
