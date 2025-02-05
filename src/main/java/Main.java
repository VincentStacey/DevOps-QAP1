import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameStore gameStore = new GameStore();
        Cart cart = new Cart();

        while (true) {
            System.out.println("\n=== Game Store ===");
            System.out.println("1. Browse Games");
            System.out.println("2. View Cart");
            System.out.println("3. Purchase");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    gameStore.displayGames();
                    System.out.print("Enter game number to add to cart (0 to go back): ");
                    int gameChoice = scanner.nextInt();
                    if (gameChoice > 0 && gameChoice <= gameStore.getAvailableGames().size()) {
                        Game selectedGame = gameStore.getGameByIndex(gameChoice - 1);
                        cart.addGame(selectedGame);
                        System.out.println(selectedGame.getTitle() + " added to cart.");
                    }
                    break;
                case 2:
                    cart.viewCart();
                    break;
                case 3:
                    if (cart.isEmpty()) {
                        System.out.println("Your cart is empty. Add games before purchasing.");
                    } else {
                        System.out.println("Purchase successful! Total: $" + cart.getTotalPrice());
                        cart.clearCart();
                    }
                    break;
                case 4:
                    System.out.println("Exiting... Thank you for visiting the Game Store!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
