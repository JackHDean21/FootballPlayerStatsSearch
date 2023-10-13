import java.io.IOException;
public class Main extends PlayerSearch {
    static WebScraper webScraper = new WebScraper();
    public static void main(String[] args) throws IOException {
        //webScraper.printOutEveryPlayerName();
        searchPlayersByName();
    }
}
