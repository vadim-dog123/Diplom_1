package praktikum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BunTest {
    private final String expName = "Мега булка";
    private final float expPrice = 1000.7f;
    private final Bun bun = new Bun(expName, expPrice);

    @Test
    public void getNameTest() {
        assertEquals(expName, bun.getName());
    }

    @Test
    public void getPriceTest() {
        assertEquals(expPrice, bun.getPrice(), 0.01);
    }
}