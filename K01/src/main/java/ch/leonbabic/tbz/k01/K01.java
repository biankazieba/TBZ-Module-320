package ch.leonbabic.tbz.k01;

import java.util.Scanner;

public class K01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isInLoop = true;
        int member = -1;
        int team = -1;

        String[] members = new String[4];
        members[0] = "Bibi";
        members[1] = "Lelon";
        members[2] = "Celi";
        members[3] = "Lolela";

        String[] teams = new String[3];
        teams[0] = "U14";
        teams[1] = "U16";
        teams[2] = "U17";

        while (isInLoop) {
            listMembers(members);

            String memberString = scanner.next();

            if (memberString.equalsIgnoreCase("x")) {
                System.out.println("You have closed the program.");
                System.exit(0);
            }
            member = Integer.parseInt(memberString);

            listTeams(teams);

            String teamString = scanner.next();

            if (teamString.equalsIgnoreCase("x")) {
                System.out.println("You have closed the program.");
                System.exit(0);
            }
            if (!teamString.equalsIgnoreCase("c")) {
                team = Integer.parseInt(teamString);
                isInLoop = false;
            }
        }

        System.out.println("You have selected the member '" + members[member] + "' with the team '" + teams[team] + "'.");
    }

    public static void listTeams(String[] teams) {
        for (int i = 0; i < teams.length; i++) {
            System.out.println(i + ": " + teams[i]);
        }
        System.out.println("x: exit");
    }

    public static void listMembers(String[] members) {
        for (int i = 0; i < members.length; i++) {
            System.out.println(i + ": " + members[i]);
        }
        System.out.println("x: exit");
    }

}
