package generics.fullGeneric;

import generics.FootballTeam;
import generics.Team;
import generics.TeamLevel;
import generics.VolleyballTeam;

public class LeagueMain {
    public static void main(String[] args) {
        League league = new League("Primiera Division");
        Team team = new FootballTeam("Barcelona", TeamLevel.PROFFESIONAL);

        Team team1 = new FootballTeam("FC Barcelona", TeamLevel.PROFFESIONAL);
        Team team2 = new FootballTeam("Real Madrit CF", TeamLevel.PROFFESIONAL);
        Team team3 = new FootballTeam("Valencia CF", TeamLevel.PROFFESIONAL);
        Team team4 = new FootballTeam("Atletico Madrit", TeamLevel.PROFFESIONAL);
        team1.setPoints(30);
        team2.setPoints(10);
        team3.setPoints(20);
        team4.setPoints(28);
        league.addTeam(team1);
        league.addTeam(team2);
        league.addTeam(team3);
        league.addTeam(team4);
        league.printTable();

        Team team5 = new VolleyballTeam("Asseco Resovia", TeamLevel.PROFFESIONAL);
        team5.setPoints(18);
        league.addTeam(team5);
        System.out.println("========");
        league.printTable();
    }
}
