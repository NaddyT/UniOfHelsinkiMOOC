
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        String file = scan.nextLine();
        
        ArrayList<Games> game = readRecordsFromFile(file);
        
        System.out.println("Team: ");
        String team = scan.nextLine();
        int gamesPlayed = 0;
        int wins = 0;
        int losses = 0;
        
        for (Games games : game) {
            if (games.getHomeTeam().contains(team)) {
                gamesPlayed = gamesPlayed + 1;
                if (Integer.valueOf(games.getHomePoints()) > Integer.valueOf(games.getAwayPoints())) {
                    wins = wins +1;
                } else {
                    losses = losses + 1;
                }
            } else if (games.getAwayTeam().contains(team)) {
                gamesPlayed = gamesPlayed + 1;
                if (Integer.valueOf(games.getAwayPoints()) > Integer.valueOf(games.getHomePoints())) {
                    wins = wins +1;
                } else {
                    losses = losses + 1;
                }
            }
        }
        
        
        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
    
    public static ArrayList<Games> readRecordsFromFile(String file) {
        ArrayList<Games> games = new ArrayList<>();

        // Write here the code for reading from file
        try (Scanner scan = new Scanner(Paths.get(file))) {
             while (scan.hasNextLine()){
                 String line = scan.nextLine();
                 String[] parts = line.split(",");
                 String homeTeam = parts[0];
                 String awayTeam = parts[1];
                 String homeTeamPoints = parts[2];
                 String awayTeamPoints = parts[3];
                 games.add(new Games(homeTeam, awayTeam, homeTeamPoints, awayTeamPoints ));
            }
        } catch (Exception e) {
             
             System.out.println("error");
         }
        return games;
    }
    
    }


