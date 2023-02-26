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
        assertEquals(ingredient.getPrice(), expIngredientPrice, 0.01);
    }

    @Test
    public void getName() {
        assertEquals(ingredient.getName(), expIngredientName);
    }

    @Test
    public void getType() {
        assertEquals(ingredient.getType(), expIngredient);
    }
}