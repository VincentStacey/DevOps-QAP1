import java.util.ArrayList;
import java.util.List;

public class GameStore {
    private List<Game> games;

    public GameStore() {
        games = new ArrayList<>();
        games.add(new Game("Minecraft", 19.99));
        games.add(new Game("Elden Ring", 59.99));
        games.add(new Game("Cyberpunk 2077", 29.99));
    }

    public List<Game> getAvailableGames() {
        return games;
    }

    public void displayGames() {
        System.out.println("\nAvailable Games:");
        for (int i = 0; i < games.size(); i++) {
            System.out.println((i + 1) + ". " + games.get(i));
        }
    }

    public Game getGameByIndex(int index) {
        if (index >= 0 && index < games.size()) {
            return games.get(index);
        }
        return null;
    }
}
