import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.util.ArrayList;
import java.util.List;

public class WebScraper {
    private static final String URL = "https://fbref.com/en/comps/Big5/stats/players/Big-5-European-Leagues-Stats";

    public static List<PlayerStats> getAllPlayerStats() throws IOException {
        List<PlayerStats> playerStatsList = new ArrayList<>();

        Document doc = Jsoup.connect(URL).get();
        Element playerStatsTable = doc.select("#all_stats_standard").first();

        assert playerStatsTable != null;
        for (Element playerRow : playerStatsTable.select("tbody tr")) {
            if (playerRow.hasClass("thead") || playerRow.hasClass("rowSum")) {
                continue;
            }
            String playerName = playerRow.select("td[data-stat=player]").text();
            String playerNationality = playerRow.select("td[data-stat=nationality]").text();
            String playerClub = playerRow.select("td[data-stat=team]").text();
            String playerPosition = playerRow.select("td[data-stat=position]").text();
            String playerAge = playerRow.select("td[data-stat=age]").text();
            String playerGamesPlayed = playerRow.select("td[data-stat=games]").text();
            String playerGoals = playerRow.select("td[data-stat=goals]").text();
            String playerAssists = playerRow.select("td[data-stat=assists]").text();
            String playerGoalContributions = playerRow.select("td[data-stat=goals_assists]").text();
            String playerNonPenaltyGoals = playerRow.select("td[data-stat=goals_pens]").text();
            String playerPenaltyGoals = playerRow.select("td[data-stat=pens_made]").text();
            String playerYellowCards = playerRow.select("td[data-stat=cards_yellow]").text();
            String playerRedCards = playerRow.select("td[data-stat=cards_red]").text();
            String playerXG = playerRow.select("td[data-stat=xg]").text();
            String playerNonPenaltyXG = playerRow.select("td[data-stat=npxg]").text();
            String playerXAG = playerRow.select("td[data-stat=xg_assist]").text();
            String playerProgressiveCarries = playerRow.select("td[data-stat=progressive_carries]").text();
            String playerProgressivePasses = playerRow.select("td[data-stat=progressive_passes]").text();
            String playerProgressivePassesReceived = playerRow.select("td[data-stat=progressive_passes_received]").text();
            String playerGoalsPer90 = playerRow.select("td[data-stat=goals_per90]").text();
            String playerAssistsPer90 = playerRow.select("td[data-stat=assists_per90]").text();
            String playerGoalContributionsPer90 = playerRow.select("td[data-stat=goals_assists_per90]").text();
            String playerNonPenaltyGoalsPer90 = playerRow.select("td[data-stat=goals_pens_per90]").text();
            String playerXGPer90 = playerRow.select("td[data-stat=xg_per90]").text();
            String playerXAGPer90 = playerRow.select("td[data-stat=xg_assist_per90]").text();

            if (!playerName.isEmpty()) {
                if (playerAge.length() >= 2) {
                    playerAge = playerAge.substring(0, 2);
                }
                String[] nationalitySubstrings = playerNationality.split(" ");
                playerNationality = nationalitySubstrings[1];
                PlayerStats playerStats = new PlayerStats(playerName, playerNationality, playerPosition, playerClub, playerAge,playerGamesPlayed, playerGoals, playerAssists, playerGoalContributions, playerNonPenaltyGoals, playerPenaltyGoals, playerYellowCards, playerRedCards, playerXG, playerNonPenaltyXG, playerXAG, playerProgressiveCarries, playerProgressivePasses, playerProgressivePassesReceived, playerGoalsPer90, playerAssistsPer90, playerGoalContributionsPer90, playerNonPenaltyGoalsPer90, playerXGPer90, playerXAGPer90);
                playerStatsList.add(playerStats);
            }

        }
        return playerStatsList;
    }
    public void printOutEveryPlayerName() throws IOException {
        Document doc = Jsoup.connect(URL).get();
        Element playerRows = doc.select("#all_stats_standard").first();

        for (Element playerRow : playerRows.select(" tbody tr")) {
            if (playerRow.hasClass("thead") || playerRow.hasClass("rowSum")) {
                continue;
            }
            String playerName = playerRow.select("td[data-stat=player]").text();
            System.out.println(playerName);
        }
    }


}



