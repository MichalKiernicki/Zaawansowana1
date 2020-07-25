package generics.withBoundaries;

import generics.FootballTeam;
import generics.Team;
import generics.TeamLevel;
import generics.VolleyballTeam;

public class LeagueMain {
    public static void main(String[] args) {
        League<FootballTeam> league = new League("Primiera Division");
        League<VolleyballTeam> volleyballTeam = new League<>("Plus Liga");
        Team team = new FootballTeam("Barcelona", TeamLevel.PROFFESIONAL);


        FootballTeam team1 = new FootballTeam("FC Barcelona", TeamLevel.PROFFESIONAL);
        FootballTeam team2 = new FootballTeam("Real Madrit CF", TeamLevel.PROFFESIONAL);
        Team team3 = new FootballTeam("Valencia CF", TeamLevel.PROFFESIONAL);
        Team team4 = new FootballTeam("Atletico Madrit", TeamLevel.PROFFESIONAL);
        team1.setPoints(30);
        team2.setPoints(10);
        team3.setPoints(20);
        team4.setPoints(28);
        league.addTeam(team1);
        league.addTeam(team2);
        league.addTeam((FootballTeam) team3);
        league.addTeam((FootballTeam) team4);
        league.printTable();

        Team team5 = new VolleyballTeam("Asseco Resovia", TeamLevel.PROFFESIONAL);
        team5.setPoints(18);
        volleyballTeam.addTeam((VolleyballTeam)team5);
        System.out.println("========");
        league.printTable();

        System.out.println("========");
        volleyballTeam.printTable();
    }
}
