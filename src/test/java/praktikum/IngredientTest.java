package praktikum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IngredientTest {

    private final IngredientType expIngredient = IngredientType.SAUCE;
    private final String expIngredientName = "Name";
    private final float expIngredientPrice = 110.7f;

    private final Ingredient ingredient = new Ingredient(expIngredient, expIngredientName, expIngredientPrice);

    @Test
    public void getPrice() {
        assertEquals(expIngredientPrice, ingredient.getPrice(), 0.01);
    }

    @Test
    public void getName() {
        assertEquals(expIngredientName, ingredient.getName());
    }

    @Test
    public void getType() {
        assertEquals(expIngredient, ingredient.getType());
    }
}