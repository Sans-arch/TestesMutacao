package entities;


import java.util.HashSet;
import java.util.Set;

public class Family {

    public Family(){}

    public Family(Set<Person> members) {
        this.members.addAll(members);
    }

    private final Set<Person> members = new HashSet<>();

    public Set<Person> getMembers() {
        return members;
    }

    public void addMember(Person member) {
        this.members.add(member);
    }

    public void addMember(Set<Person> members) {
        this.members.addAll(members);
    }

    public void removeMember(Person member) {
        this.members.remove(member);
    }

    public Set<Person> showMembers() {
        return this.members;
    }
}
