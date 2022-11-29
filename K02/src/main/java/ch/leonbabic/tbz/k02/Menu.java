package ch.leonbabic.tbz.k02;

import java.util.Scanner;

public class Menu {

    private Team[] teams;
    private Member[] members;

    private Team selectedTeam;
    private Member selectedMember;

    private Scanner scanner;

    public Menu() {
        this.teams = new TeamManager().getTeams();
        this.members = new MemberManager().getMembers();
        this.scanner = new Scanner(System.in);
    }

    public void showMenu() {
        this.checkMemberInput();
        this.checkTeamInput();

        System.out.println("You have selected the member '" + this.getSelectedMember().getName() + "' with the team '" + this.getSelectedTeam().getName() + "'.");
    }

    public void checkMemberInput() {
        do {
            System.out.println("Members:");
            printMembers();
            System.out.println("x: Exit");
            System.out.println("Select a member: ");

            String input = scanner.next();

            if (input.equalsIgnoreCase("x")) System.exit(0);

            if (!input.isEmpty()) {
                this.selectedMember = members[Integer.parseInt(input)];
                break;
            }
        } while (true);
    }

    public void checkTeamInput() {
        do {
            System.out.println("Teams:");
            printTeams();
            System.out.println("x: Exit");
            System.out.println("Select a Team: ");

            String input = scanner.next();

            if (input.equalsIgnoreCase("x")) System.exit(0);

            if (!input.isEmpty()) {
                this.selectedTeam = teams[Integer.parseInt(input)];
                break;
            }
        } while (true);
    }

    private void printTeams() {
        for (int i = 0; i < this.teams.length; i++) {
            System.out.println(i + ": " + this.teams[i].getName());
        }
    }

    private void printMembers() {
        for (int i = 0; i < this.members.length; i++) {
            System.out.println(i + ": " + this.members[i].getName());
        }
    }

    public Member getSelectedMember() {
        return selectedMember;
    }

    public Team getSelectedTeam() {
        return selectedTeam;
    }
}
