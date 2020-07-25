package generics.withBoundaries;

import generics.FootballTeam;
import generics.TeamLevel;
import generics.VolleyballTeam;

public class EnumDemo {

    public static void main(String[] args) {

        FootballTeam footballTeam = new FootballTeam("LA Galxy", TeamLevel.PROFFESIONAL);

        if (footballTeam.getTeamLevel() == TeamLevel.PROFFESIONAL) {
            System.out.println(footballTeam.getName() + " full profeska");
        }
        System.out.println(footballTeam.getName() + " " + provideDescripton(footballTeam.getTeamLevel()));

        TeamLevel level = TeamLevel.getByAbbrevation("a");
        VolleyballTeam volleyballTeam = new VolleyballTeam("Skra Bełchatów", level);
        System.out.println(volleyballTeam.getName() + " " + volleyballTeam.getTeamLevel().getPlace());

    }

    public static String provideDescripton(TeamLevel level) {
        switch (level) {
            case PROFFESIONAL:
                return "Poziom PRO " + level.getPlace();
            case AMATEUR:
                return "Poziom Amatorka " + level.getPlace();
        }
        return "";
    }
}
