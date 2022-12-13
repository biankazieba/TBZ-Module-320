package ch.leonbabic.tbz.k03.model;

/**
 * Team of a volleyball club
 *
 * @author Leon Babic and Bianka Zieba
 * @version K03
 * @since K02
 */
public class Team {

    private String name;

    /**
     * @param name of team
     * @since K02
     */
    public Team(String name) {
        this.name = name;
    }

    /**
     * @return name of team
     * @since K02
     */
    public String getName() {
        return name;
    }
}
