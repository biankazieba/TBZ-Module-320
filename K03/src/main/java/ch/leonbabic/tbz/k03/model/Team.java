package ch.leonbabic.tbz.k03.model;

/**
 * Team of a volleyball club
 */
public class Team {

    private String name;

    /**
     * @param name of team
     */
    public Team(String name) {
        this.name = name;
    }

    /**
     * @return name of team
     */
    public String getName() {
        return name;
    }
}
