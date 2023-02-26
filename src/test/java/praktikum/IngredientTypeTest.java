package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IngredientTypeTest {

    private final IngredientType type;
    private final String expected;

    public IngredientTypeTest(IngredientType type, String expected) {
        this.type = type;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "Тестовые данные: {1}, {0}")
    public static Object[][] getTestData() {
        final Object[][] objects = {{IngredientType.FILLING, "FILLING"}, {IngredientType.SAUCE, "SAUCE"},};
        return objects;
    }

    @Test
    public void ingredientTypeTest() {
        assertEquals("Значение енума отличается от ожадаймого", type.toString(), expected);
    }
}