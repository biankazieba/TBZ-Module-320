package k07.manager;

import k07.model.Member;
import k07.model.Team;

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
        ListHandler<Team> handler = new ListHandler<>(teams);
        handler.sortAscending();
        teams = handler.getItems();
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
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
