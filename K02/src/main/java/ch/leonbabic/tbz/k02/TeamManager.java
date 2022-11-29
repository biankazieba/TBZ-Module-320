package ch.leonbabic.tbz.k02;

public class TeamManager {

    private Team[] teams;

    public TeamManager() {
        this.teams = new Team[]{
                new Team("U16"),
                new Team("U17"),
                new Team("U19"),
                new Team("U20")
        };
    }

    public Team[] getTeams() {
        return teams;
    }
}
