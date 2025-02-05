import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CartTest {

    @Test
    void testAddGameToCart() {
        Cart cart = new Cart();
        Game game = new Game("Test Game", 20.0);
        cart.addGame(game);
        assertEquals(20.0, cart.getTotalPrice(), 0.01);
    }

    @Test
    void testEmptyCartTotal() {
        Cart cart = new Cart();
        assertEquals(0.0, cart.getTotalPrice(), 0.01);
    }

    @Test
    void testClearCart() {
        Cart cart = new Cart();
        cart.addGame(new Game("Test Game", 20.0));
        cart.clearCart();
        assertEquals(0.0, cart.getTotalPrice(), 0.01);
    }
}
