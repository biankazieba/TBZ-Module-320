package ch.leonbabic.tbz.k02;

import java.util.Arrays;

public class Program {

    public static void main(String[] args) {
        // Setup teams
        Team[] teams = new Team[]{
                new Team("U16"),
                new Team("U17"),
                new Team("U19"),
                new Team("U20")
        };

        // Setup members
        Member[] members = new Member[]{
                new Member("Leon", 17),
                new Member("Bianka", 16),
        };

        // Initialize menu
        Menu menu = new Menu(teams, members);

        menu.checkMemberInput();
        menu.checkTeamInput();

        System.out.println("You have selected the member '" + menu.getSelectedMember().getName() + "' with the team '" + menu.getSelectedTeam().getName() + "'.");
    }
}
