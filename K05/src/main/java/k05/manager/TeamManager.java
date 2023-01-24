package k05.manager;

import k05.model.Member;
import k05.model.Team;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Leon Babic and Bianka Zieba
 * @version K03
 * Manager class for teams
 */
public class TeamManager implements IManager<Team> {

    ArrayList<Team> teams;

    /**
     * Initialize teams
     *
     * @since K02
     */
    public TeamManager() {
        teams = new ArrayList<>(Arrays.asList(
                new Team("U16"),
                new Team("U17"),
                new Team("U19"),
                new Team("U20"))
        );
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    @Override
    public void add(Team team) {
        teams.add(team);

    }

    @Override
    public void remove(int index) {
        teams.remove(index);
    }
}
