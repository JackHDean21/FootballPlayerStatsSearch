public class PlayerStats {
    private String playerName;
    private String playerNationality;
    private String playerPosition;
    private String playerClub;
    private String playerAge;
    private String playerGamesPlayed;
    private String playerGoals;
    private String playerAssists;
    private String playerGoalContributions;
    private String playerNonPenaltyGoals;
    private String playerPenaltyGoals;
    private String playerYellowCards;
    private String playerRedCards;
    private String playerXG;
    private String playerNonPenaltyXG;
    private String playerXAG;
    private String playerProgressiveCarries;
    private String playerProgressivePasses;
    private String playerProgressivePassesReceived;
    private String playerGoalsPer90;
    private String playerAssistsPer90;
    private String playerGoalContributionsPer90;
    private String playerNonPenaltyGoalsPer90;
    private String playerXGPer90;
    private String playerXAGPer90;

    public PlayerStats(String playerName, String playerNationality, String playerPosition, String playerClub, String playerAge, String playerGamesPlayed, String playerGoals, String playerAssists, String playerGoalContributions, String playerNonPenaltyGoals, String playerPenaltyGoals, String playerYellowCards, String playerRedCards, String playerXG, String playerNonPenaltyXG, String playerXAG, String playerProgressiveCarries, String playerProgressivePasses, String playerProgressivePassesReceived, String playerGoalsPer90, String playerAssistsPer90, String playerGoalContributionsPer90, String playerNonPenaltyGoalsPer90, String playerXGPer90, String playerXAGPer90) {
        this.playerName = playerName;
        this.playerNationality = playerNationality;
        this.playerPosition = playerPosition;
        this.playerClub = playerClub;
        this.playerAge = playerAge;
        this.playerGamesPlayed = playerGamesPlayed;
        this.playerGoals = playerGoals;
        this.playerAssists = playerAssists;
        this.playerGoalContributions = playerGoalContributions;
        this.playerNonPenaltyGoals = playerNonPenaltyGoals;
        this.playerPenaltyGoals = playerPenaltyGoals;
        this.playerYellowCards = playerYellowCards;
        this.playerRedCards = playerRedCards;
        this.playerXG = playerXG;
        this.playerNonPenaltyXG = playerNonPenaltyXG;
        this.playerXAG = playerXAG;
        this.playerProgressiveCarries = playerProgressiveCarries;
        this.playerProgressivePasses = playerProgressivePasses;
        this.playerProgressivePassesReceived = playerProgressivePassesReceived;
        this.playerGoalsPer90 = playerGoalsPer90;
        this.playerAssistsPer90 = playerAssistsPer90;
        this.playerGoalContributionsPer90 = playerGoalContributionsPer90;
        this.playerNonPenaltyGoalsPer90 = playerNonPenaltyGoalsPer90;
        this.playerXGPer90 = playerXGPer90;
        this.playerXAGPer90 = playerXAGPer90;
    }



    public String getPlayerName() {
        return playerName;
    }
    public String getPlayerNationality() { return playerNationality;}

    public String getPlayerPosition() {
        return playerPosition;
    }
    public String getPlayerClub() { return playerClub;}

    public String getPlayerAge() {
        return playerAge;
    }

    public String getPlayerGamesPlayed() { return playerGamesPlayed;
    }
    public String getPlayerGoals() { return playerGoals;
    }
    public String getPlayerAssists() { return playerAssists;
    }
    public String getPlayerGoalContributions() {
        return playerGoalContributions;
    }

    public String getPlayerNonPenaltyGoals() {
        return playerNonPenaltyGoals;
    }

    public String getPlayerPenaltyGoals() {
        return playerPenaltyGoals;
    }

    public String getPlayerYellowCards() {
        return playerYellowCards;
    }

    public String getPlayerRedCards() {
        return playerRedCards;
    }

    public String getPlayerXG() {
        return playerXG;
    }

    public String getPlayerNonPenaltyXG() {
        return playerNonPenaltyXG;
    }

    public String getPlayerXAG() {
        return playerXAG;
    }

    public String getPlayerProgressiveCarries() {
        return playerProgressiveCarries;
    }

    public String getPlayerProgressivePasses() {
        return playerProgressivePasses;
    }

    public String getPlayerProgressivePassesReceived() {
        return playerProgressivePassesReceived;
    }

    public String getPlayerGoalsPer90() {
        return playerGoalsPer90;
    }

    public String getPlayerAssistsPer90() {
        return playerAssistsPer90;
    }

    public String getPlayerGoalContributionsPer90() {
        return playerGoalContributionsPer90;
    }

    public String getPlayerNonPenaltyGoalsPer90() {
        return playerNonPenaltyGoalsPer90;
    }

    public String getPlayerXGPer90() {
        return playerXGPer90;
    }

    public String getPlayerXAGPer90() {
        return playerXAGPer90;
    }

    public String displayBasicPlayerStats() {
        return "Player Name: " + playerName + " | Nationality: " + playerNationality + " | Club: " + playerClub + " | Position: " + playerPosition + " | Age: " + playerAge + " | Goals: " + playerGoals + " | Assists: " + playerAssists;
    }
    static void displayAdvancedPlayerStats(PlayerStats player) {
        System.out.println("\nGeneral Player Info:\n");
        System.out.println("Player Name: " + player.getPlayerName());
        System.out.println("Player Nationality: " + player.getPlayerNationality());
        System.out.println("Position: " + player.getPlayerPosition());
        System.out.println("Club: " + player.getPlayerClub());
        System.out.println("Age: " + player.getPlayerAge());
        System.out.println("Games Played: " + player.getPlayerGamesPlayed());
        System.out.println("\nPerformance:\n");
        System.out.println("Goals: " + player.getPlayerGoals());
        System.out.println("Assists: " + player.getPlayerAssists());
        System.out.println("Goal Contributions: " + player.getPlayerGoalContributions());
        System.out.println("Non Penalty Goals: " + player.getPlayerNonPenaltyGoals());
        System.out.println("Penalty Goals: " + player.getPlayerPenaltyGoals());
        System.out.println("Yellow Cards: " + player.getPlayerYellowCards());
        System.out.println("Red Cards: " + player.getPlayerRedCards());
        System.out.println("Red Cards: " + player.getPlayerRedCards());
        System.out.println("\nExpected Stats:\n");
        System.out.println("xG: " + player.getPlayerXG());
        System.out.println("Non Penalty xG: " + player.getPlayerNonPenaltyXG());
        System.out.println("Player xAG: " + player.getPlayerXAG());
        System.out.println("\nProgression Stats:\n");
        System.out.println("Progressive Carries: " + player.getPlayerProgressiveCarries());
        System.out.println("Progressive Passes: " + player.getPlayerProgressivePasses());
        System.out.println("Progressive Passes Received: " + player.getPlayerProgressivePassesReceived());
        System.out.println("\nPer 90 Stats:\n");
        System.out.println("Goals Per 90: " + player.getPlayerGoalsPer90());
        System.out.println("Assists Per 90: " + player.getPlayerAssistsPer90());
        System.out.println("Goal Contributions Per 90: " + player.getPlayerGoalContributionsPer90());
        System.out.println("Non Penalty Goals Per 90: " + player.getPlayerNonPenaltyGoalsPer90());
        System.out.println("xG Per 90: " + player.getPlayerXGPer90());
        System.out.println("xAG Per 90: " + player.getPlayerXAGPer90());

    }

}
