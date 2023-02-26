package ua.home;

import ua.home.datasGames.CitiesPlacesForGame;
import ua.home.datasGames.Coaches;
import ua.home.datasGames.FootballTeams;
import ua.home.datasGames.Players;

public class Main {
    public static void main(String[] args) {
        Players players = new Players();
        CitiesPlacesForGame place = new CitiesPlacesForGame();
        FootballTeams team = new FootballTeams();
        Coaches coach = new Coaches();
        System.out.println();
        players.getPlayer();
        place.getCity();
        team.getFootballTeam();
        coach.getCoach();
    }
}
