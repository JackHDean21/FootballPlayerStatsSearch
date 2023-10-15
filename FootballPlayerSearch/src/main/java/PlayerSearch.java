import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayerSearch extends WebScraper {
    public static boolean searchPrompt(String searchBy) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Would you like to search for a player by their " + searchBy + "? (\"Yes\" or \"No\")");
            String searchByName = scanner.nextLine();

            if (searchByName.equalsIgnoreCase("yes")) {
                break;
            } else if (searchByName.equalsIgnoreCase("no")) {
                return false;
            } else {
                System.out.println("Please enter \"Yes\" or \"No\"");
            }
        }
        return true;
    }
    public static void searchPlayersByName() throws IOException {
        boolean searchForName = searchPrompt("name");
        if (!(searchForName)) {
            searchPlayersByPosition();
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the name of the player: ");
            String nameSearch = scanner.nextLine().toLowerCase();
            System.out.println("Fetching player results...\n");

            List<PlayerStats> playerStatsList = getAllPlayerStats();

            int resultCount = 0;
            List<PlayerStats> searchResults = new ArrayList<>();

            for (PlayerStats playerStats : playerStatsList) {
                if (playerStats.getPlayerName().toLowerCase().contains(nameSearch)) {
                    resultCount++;
                    searchResults.add(playerStats);
                }
            }
            if (resultCount == 0) {
                System.out.println("No player with the name '" + nameSearch.substring(0, 1).toUpperCase() + nameSearch.substring(1).toLowerCase() + "' found.");
            } else if (resultCount == 1) {
                System.out.println("Only one result found that matches your search:\n");
                PlayerStats onlyResult = searchResults.get(0);
                PlayerStats.displayAdvancedPlayerStats(onlyResult);
            } else {
                System.out.println(resultCount + " results found based on your search:\n");
                for (int i = 0; i < searchResults.size(); i++) {
                    PlayerStats player = searchResults.get(i);
                    System.out.println((i + 1) + ". " + player.displayBasicPlayerStats());
                }
                System.out.print("\nEnter the number of the player to view stats: ");
                int playerNumber = scanner.nextInt();

                if (playerNumber >= 1 && playerNumber <= resultCount) {
                    PlayerStats selectedPlayer = searchResults.get(playerNumber - 1);
                    System.out.println("\nFetching and displaying stats for player " + selectedPlayer.getPlayerName() + "...\n");
                    PlayerStats.displayAdvancedPlayerStats(selectedPlayer);
                } else {
                    System.out.println("Invalid player number. Please enter a valid number out of one of the previous " + resultCount + " results.");
                }
            }
        }


    }

    private static void searchPlayersByPosition() throws IOException {
        boolean searchForPosition = searchPrompt("position");
        if (!(searchForPosition)) {
            searchPlayersByNationality();
        } else{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the position of the player: (\"Forward\", \"Midfielder\", \"Defender\" or \"Goalkeeper\".)\n");
            String positionSearch = scanner.nextLine().trim();
            if(positionSearch.equalsIgnoreCase("midfielder")) {
                positionSearch = "mf";
            }
            if(positionSearch.equalsIgnoreCase("forward")){
                positionSearch = "fw";
            }
            if (positionSearch.equalsIgnoreCase("defender")){
                positionSearch = "df";
            }
            if (positionSearch.equalsIgnoreCase("goalkeeper")) {
                positionSearch = "gk";
            }
            System.out.println("Fetching player results...\n");
            List<PlayerStats> playerStatsList = getAllPlayerStats();

            int resultCount = 0;
            List<PlayerStats> searchResults = new ArrayList<>();

            for (PlayerStats playerStats : playerStatsList) {
                if (playerStats.getPlayerPosition().toLowerCase().contains(positionSearch)) {
                    resultCount++;
                    searchResults.add(playerStats);
                }
            }
            if (resultCount == 0) {
                System.out.println("No player with the position '" + positionSearch.substring(0, 1).toUpperCase() + positionSearch.substring(1).toLowerCase() + "' found.");
            } else if (resultCount == 1) {
                System.out.println("Only one result found that matches your search:\n");
                PlayerStats onlyResult = searchResults.get(0);
                PlayerStats.displayAdvancedPlayerStats(onlyResult);
            } else {
                System.out.println(resultCount + " results found based on your search:\n");
                for (int i = 0; i < searchResults.size(); i++) {
                    PlayerStats playerStats = searchResults.get(i);
                    System.out.println((i + 1) + ". " + playerStats.displayBasicPlayerStats());
                }
                System.out.print("\nEnter the number of the player to view stats: ");
                int playerNumber = scanner.nextInt();

                if (playerNumber >= 1 && playerNumber <= resultCount) {
                    PlayerStats selectedPlayer = searchResults.get(playerNumber - 1);
                    System.out.println("\nFetching and displaying stats for player " + selectedPlayer.getPlayerName() + "...\n");
                    PlayerStats.displayAdvancedPlayerStats(selectedPlayer);
                } else {
                    System.out.println("Invalid player number. Please enter a valid number out of one of the previous " + resultCount + " results.");
                }
            }
        }


    }
    public static void searchPlayersByNationality() throws IOException {
        Countries countries = new Countries();
        boolean searchForNationality = searchPrompt("nationality");
        if (!searchForNationality) {
            searchPlayersByAge();
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the nationality of the player: ");
            String nationalitySearch = scanner.nextLine().trim();
            String countryCode = Countries.getCodeFromCountry(nationalitySearch);
            System.out.println("Fetching player results...\n");

            List<PlayerStats> playerStatsList = getAllPlayerStats();

            List<PlayerStats> searchResults = new ArrayList<>();

            for (PlayerStats playerStats : playerStatsList) {
                String playerNationality = playerStats.getPlayerNationality();
                if (playerNationality.equalsIgnoreCase(countryCode)) {
                    searchResults.add(playerStats);
                }

            }

            if (searchResults.isEmpty()) {
                System.out.println("No player with the nationality '" + nationalitySearch.substring(0,1).toUpperCase() + nationalitySearch.substring(1).toLowerCase() + "' found.");
            } else if (searchResults.size() == 1) {
                System.out.println("Only one result found that matches your search:\n");
                PlayerStats onlyResult = searchResults.get(0);
                PlayerStats.displayAdvancedPlayerStats(onlyResult);
            } else {
                System.out.println(searchResults.size() + " results found based on your search:\n");
                for (int i = 0; i < searchResults.size(); i++) {
                    PlayerStats playerStats = searchResults.get(i);
                    System.out.println((i + 1) + ". " + playerStats.displayBasicPlayerStats());
                }
                System.out.print("\nEnter the number of the player to view stats: ");
                int playerNumber = scanner.nextInt();

                if (playerNumber >= 1 && playerNumber <= searchResults.size()) {
                    PlayerStats selectedPlayer = searchResults.get(playerNumber - 1);
                    System.out.println("\nFetching and displaying stats for player " + selectedPlayer.getPlayerName() + "...\n");
                    PlayerStats.displayAdvancedPlayerStats(selectedPlayer);
                } else {
                    System.out.println("Invalid player number. Please enter a valid number out of one of the previous " + searchResults.size() + " results.");
                }
            }
        }
    }



    public static void searchPlayersByAge() throws IOException {
        boolean searchForNationality = searchPrompt("age");
        if (!searchForNationality) {
            searchPlayersByClub();
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the age of the player: ");
            String nationalitySearch = scanner.nextLine();

            System.out.println("Fetching player results...\n");

            List<PlayerStats> playerStatsList = getAllPlayerStats();

            int resultCount = 0;
            List<PlayerStats> searchResults = new ArrayList<>();

            for (PlayerStats playerStats : playerStatsList) {
                if (playerStats.getPlayerAge().equalsIgnoreCase(nationalitySearch)) {
                    resultCount++;
                    searchResults.add(playerStats);
                }
            }
            if (resultCount == 0) {
                System.out.println("No player with the age '" + nationalitySearch.substring(0, 1).toUpperCase() + nationalitySearch.substring(1).toLowerCase() + "' found.");
            } else if (resultCount == 1) {
                System.out.println("Only one result found that matches your search:\n");
                PlayerStats onlyResult = searchResults.get(0);
                PlayerStats.displayAdvancedPlayerStats(onlyResult);
            } else {
                System.out.println(resultCount + " results found based on your search:\n");
                for (int i = 0; i < searchResults.size(); i++) {
                    PlayerStats playerStats = searchResults.get(i);
                    System.out.println((i + 1) + ". " + playerStats.displayBasicPlayerStats());
                }
                System.out.print("\nEnter the number of the player to view stats: ");
                int playerNumber = scanner.nextInt();

                if (playerNumber >= 1 && playerNumber <= resultCount) {
                    PlayerStats selectedPlayer = searchResults.get(playerNumber - 1);
                    System.out.println("\nFetching and displaying stats for player " + selectedPlayer.getPlayerName() + "...\n");
                    PlayerStats.displayAdvancedPlayerStats(selectedPlayer);
                } else {
                    System.out.println("Invalid player number. Please enter a valid number out of one of the previous " + resultCount + " results.");
                }
            }

        }

    }
    public static void searchPlayersByClub() throws IOException {
        boolean searchForClub = searchPrompt("club");
        if (!searchForClub) {
            searchPlayersByClub();
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the club of the player: ");
            String clubSearch = scanner.nextLine();

            System.out.println("Fetching player results...\n");

            List<PlayerStats> playerStatsList = getAllPlayerStats();

            int resultCount = 0;
            List<PlayerStats> searchResults = new ArrayList<>();

            for (PlayerStats playerStats : playerStatsList) {
                if (playerStats.getPlayerClub().equalsIgnoreCase(clubSearch)) {
                    resultCount++;
                    searchResults.add(playerStats);
                }
            }
            if (resultCount == 0) {
                System.out.println("No player that plays for the club: '" + clubSearch.substring(0, 1).toUpperCase() + clubSearch.substring(1).toLowerCase() + "' found.");
            } else if (resultCount == 1) {
                System.out.println("Only one result found that matches your search:\n");
                PlayerStats onlyResult = searchResults.get(0);
                PlayerStats.displayAdvancedPlayerStats(onlyResult);
            } else {
                System.out.println(resultCount + " results found based on your search:\n");
                for (int i = 0; i < searchResults.size(); i++) {
                    PlayerStats playerStats = searchResults.get(i);
                    System.out.println((i + 1) + ". " + playerStats.displayBasicPlayerStats());
                }
                System.out.print("\nEnter the number of the player to view stats: ");
                int playerNumber = scanner.nextInt();

                if (playerNumber >= 1 && playerNumber <= resultCount) {
                    PlayerStats selectedPlayer = searchResults.get(playerNumber - 1);
                    System.out.println("\nFetching and displaying stats for player " + selectedPlayer.getPlayerName() + "...\n");
                    PlayerStats.displayAdvancedPlayerStats(selectedPlayer);
                } else {
                    System.out.println("Invalid player number. Please enter a valid number out of one of the previous " + resultCount + " results.");
                }
            }

        }

    }


}