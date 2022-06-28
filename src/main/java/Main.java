import entities.Family;
import entities.Neighborhood;
import entities.Person;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Michael", 25, 82.5, 1.98);
        Person p2 = new Person("John", 21, 70.2, 1.78);
        Person p3 = new Person("Maria", 45, 52.5, 1.68);
        Person p4 = new Person("Nick", 51, 80, 1.83);

        Family f1 = new Family();
        f1.addMember(p1);
        f1.addMember(p2);

        HashSet<Person> remainMembers = new HashSet<>();
        remainMembers.add(p3);
        remainMembers.add(p4);

        f1.addMember(remainMembers);

        Neighborhood n1 = new Neighborhood();
        n1.addFamily(f1);

    }
}
