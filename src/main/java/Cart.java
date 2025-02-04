import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Game> games = new ArrayList<>();

    public void addGame(Game game) {
        games.add(game);
    }

    public double getTotalPrice() {
        return games.stream().mapToDouble(Game::getPrice).sum();
    }

    public void viewCart() {
        if (games.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("\nYour Cart:");
            games.forEach(game -> System.out.println("- " + game));
            System.out.println("Total: $" + getTotalPrice());
        }
    }

    public void clearCart() {
        games.clear();
    }

    public boolean isEmpty() {
        return games.isEmpty();
    }
}
