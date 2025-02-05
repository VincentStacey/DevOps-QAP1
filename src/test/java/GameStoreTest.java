import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameStoreTest {

    @Test
    void testGameListNotEmpty() {
        GameStore store = new GameStore();
        assertFalse(store.getAvailableGames().isEmpty());
    }

    @Test
    void testGetValidGameByIndex() {
        GameStore store = new GameStore();
        Game game = store.getGameByIndex(0);
        assertNotNull(game);
        assertEquals("Tom Clancy's Rainbow Six Siege", game.getTitle());
    }

    @Test
    void testGetInvalidGameByIndex() {
        GameStore store = new GameStore();
        Game game = store.getGameByIndex(100);
        assertNull(game);
    }
}
