package ch.leonbabic.tbz.k03.model;

/**
 * Member of a Volleyball team
 */
public class Member {

    private String name;
    private int age;

    /**
     * @param name of member
     * @param age  of member
     */
    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * @return member name
     */
    public String getName() {
        return name;
    }

    /**
     * @return member age
     */
    public int getAge() {
        return age;
    }
}
