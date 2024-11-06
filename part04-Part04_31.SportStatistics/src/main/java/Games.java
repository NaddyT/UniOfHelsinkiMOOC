/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xlumi
 */
public class Games {
    
    private String homeTeam;
    private String awayTeam;
    private String homeTeamPoints;
    private String awayTeamPoints;
    
    public Games(String homeTeam, String awayTeam, String homeTeamPoints, String awayTeamPoints) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeTeamPoints = homeTeamPoints;
        this.awayTeamPoints = awayTeamPoints;
    }
    
    public String getHomeTeam() {
        return this.homeTeam;
    }
    
    public String getAwayTeam() {
        return this.awayTeam;
    }
    
    public String getHomePoints(){
        return this.homeTeamPoints;
    }
    
    public String getAwayPoints(){
        return this.awayTeamPoints;
    }
}
