package praktikum;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

public class BurgerTest {

    @Mock
    Bun bun;
    @Mock
    Ingredient ingredient;
    float bunPrice = 50f;
    float ingredientPrice = 5f;
    float burgerPrice = bunPrice * 2 + ingredientPrice;

     String expReceipt = "(==== bun ====)\r\n" +
            "= sauce ingredientName =\r\n" +
            "(==== bun ====)\r\n" +
            "\r\n" +
            "Price: 105,000000\r\n";

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void getPriceTest() {
        Burger burger = new Burger();
        Mockito.when(bun.getPrice()).thenReturn(bunPrice);
        Mockito.when(ingredient.getPrice()).thenReturn(ingredientPrice);
        burger.setBuns(bun);
        burger.addIngredient(ingredient);
        System.out.println(burger.getPrice());
        assertEquals("Стоймость бургера посщитана не верно", burger.getPrice(), burgerPrice, 0.01);
    }

    @Test
    public void getReceipt() {
        Burger burger = new Burger();
        Mockito.when(bun.getPrice()).thenReturn(bunPrice);
        Mockito.when(bun.getName()).thenReturn("bun");
        Mockito.when(ingredient.getPrice()).thenReturn(ingredientPrice);
        Mockito.when(ingredient.getName()).thenReturn("ingredientName");
        Mockito.when(ingredient.getType()).thenReturn(IngredientType.SAUCE);
        burger.setBuns(bun);
        burger.addIngredient(ingredient);
        System.out.println(burger.getReceipt());
        System.out.println( expReceipt);
        assertEquals("Тект чера не совпадает с ожидаймым",
                expReceipt,
                burger.getReceipt());
    }
}