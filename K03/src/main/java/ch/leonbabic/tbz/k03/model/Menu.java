package ch.leonbabic.tbz.k03.model;

import ch.leonbabic.tbz.k03.exception.MissmatchInputException;
import ch.leonbabic.tbz.k03.manager.MemberManager;
import ch.leonbabic.tbz.k03.manager.TeamManager;

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
            try {
                this.selectedMember = members[checkInput()];
                break;
            } catch (MissmatchInputException exception) {
                System.out.println(exception.getMessage());
            }
        } while (true);
    }

    public void checkTeamInput() {
        do {
            System.out.println("Teams:");
            printTeams();
            try {
                this.selectedTeam = teams[checkInput()];
                break;
            } catch (MissmatchInputException exception) {
                System.out.println(exception.getMessage());
            }
        } while (true);
    }

    private int checkInput() throws MissmatchInputException {
        System.out.println("x: Exit");
        System.out.println("Your selection: ");
        String input = scanner.next();

        if (input.equalsIgnoreCase("x")) System.exit(0);

        try {
            int i = Integer.parseInt(input);
            if (teams.length - 1 < i || members.length - 1 < i || i < 0)
                throw new MissmatchInputException("'" + input + "' not found.\n");
            return Integer.parseInt(input);
        } catch (NumberFormatException exception) {
            throw new MissmatchInputException("'" + input + "' not found.\n");
        }
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
