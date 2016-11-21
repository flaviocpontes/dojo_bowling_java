package BowlingGame;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class BowlingTest {
    private Game g;

    private void rollMany(int n, int pins) {
        for (int i = 0; i< n; i++) {
            g.roll(pins);
        }
    }

    @Before
    public void setUp() throws Exception {
        g = new Game();
    }

    @Test
    public void canRoll() throws Exception {
        g.roll(0);
    }

    @Test
    public void gutterGame() throws Exception {
        rollMany(20, 0);
        assertEquals(0, g.score());
    }

    @Test
    public void allOnes() throws Exception {
        rollMany(20, 1);
        assertEquals(20, g.score());
    }

}
