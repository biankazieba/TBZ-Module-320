package k07.model;

/**
 * Team of a volleyball club
 *
 * @author Leon Babic and Bianka Zieba
 * @version K03
 * @since K02
 */
public class Team extends AbstractEntity implements Comparable<Team> {

    /**
     * @param name of team
     * @since K02
     */
    public Team(String name) {
        super(name);
    }

    @Override
    public int compareTo(Team o) {
        return 0;
    }
}
