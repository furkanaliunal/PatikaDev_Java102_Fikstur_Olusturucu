import Match.MatchManager;
import Team.TeamManager;

public class Main{
    public static void main(String[] args) {
        TeamManager teamManager = new TeamManager();
        MatchManager matchManager = new MatchManager(teamManager);
        matchManager.printAllRounds();

    }
}