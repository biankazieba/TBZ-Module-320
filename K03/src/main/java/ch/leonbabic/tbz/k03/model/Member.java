package ch.leonbabic.tbz.k03.model;

/**
 * Member of a Volleyball team
 *
 * @author Leon Babic and Bianka Zieba
 * @version K03
 * @since K02
 */
public class Member {

    private String name;
    private int age;

    /**
     * @param name of member
     * @param age  of member
     * @since K02
     */
    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * @return member name
     * @since K02
     */
    public String getName() {
        return name;
    }

    /**
     * @return member age
     * @since K02
     */
    public int getAge() {
        return age;
    }
}
