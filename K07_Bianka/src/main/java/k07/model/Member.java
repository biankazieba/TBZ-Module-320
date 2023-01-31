package k07.model;

/**
 * Member of a Volleyball team
 *
 * @author Leon Babic and Bianka Zieba
 * @version K03
 * @since K02
 */
public class Member extends AbstractEntity implements Comparable<Member> {

    public int age;
    private Address address;

    public Member(String name, int age, Address address) {
        super(name);
        this.age = age;
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public int compareTo(Member o) {
        return 0;
    }
}
