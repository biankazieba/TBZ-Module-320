package k05.manager;

import k05.model.Team;

/**
 * @author Leon Babic and Bianka Zieba
 * @version K03
 * Manager class for teams
 */
public class TeamManager extends AbstractManager<Team> {

    /**
     * Initialize teams
     *
     * @since K02
     */
    public TeamManager() {
        super(new Team[]{
                new Team("U16"),
                new Team("U17"),
                new Team("U19"),
                new Team("U20")
        });
    }

}
