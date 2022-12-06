package ch.leonbabic.tbz.k03.manager;

import ch.leonbabic.tbz.k03.model.Team;

/**
 * Manager class for teams
 */
public class TeamManager {

    private Team[] teams;

    /**
     * Initialize teams
     */
    public TeamManager() {
        this.teams = new Team[]{
                new Team("U16"),
                new Team("U17"),
                new Team("U19"),
                new Team("U20")
        };
    }

    /**
     * @return teams
     */
    public Team[] getTeams() {
        return teams;
    }
}
