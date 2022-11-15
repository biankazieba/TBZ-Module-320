package ch.leonbabic.tbz.k01;

import java.util.Scanner;

public class K01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] members = {"Bibi", "Lelon", "Celi", "Lolela"};
        String[] teams = {"U14", "U16", "U17"};

        int member;
        int team;

        while (true) {
            // Select members
            listMembers(members);
            System.out.println("x: Exit");
            String input = scanner.next();
            if (input.equalsIgnoreCase("x")) closeProgram();
            member = Integer.parseInt(input);

            // Select teams
            listTeams(teams);
            System.out.println("x: Exit");
            input = scanner.next();
            if (input.equalsIgnoreCase("x")) closeProgram();
            if (!input.equalsIgnoreCase("c")) {
                team = Integer.parseInt(input);
                break;
            }
        }
        System.out.println("You have selected the member '" + members[member] + "' with the team '" + teams[team] + "'.");
    }

    public static void closeProgram() {
        System.out.println("You have closed the program.");
        System.exit(0);
    }

    public static void listTeams(String[] teams) {
        for (int i = 0; i < teams.length; i++) {
            System.out.println(i + ": " + teams[i]);
        }
    }

    public static void listMembers(String[] members) {
        for (int i = 0; i < members.length; i++) {
            System.out.println(i + ": " + members[i]);
        }
    }
}
