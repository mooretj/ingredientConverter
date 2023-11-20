package testcom;

import com.Ingredients.BrownSugar;
import com.Ingredients.Flour;
import com.Ingredients.Ingredient;
import com.Ingredients.VanillaExtract;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class IngredientTest {

    @Test
    public void flourCupsToGramsTest() {
        Ingredient testObject = new Flour() {
        };
        int answer = testObject.cupsToGrams(testObject,10);
        Assert.assertEquals(1200.0, answer, 0.0);
    }

    @Test
    public void brownSugarTbspToGramsTest() {
        Ingredient testObject = new BrownSugar();
        int answer = testObject.tablespoonsToGrams(testObject,5);
        Assert.assertEquals(68.75, answer, 0.0);
    }

    @Test
    public void vanillaExtractTspToGramsTest() {
        Ingredient testObject = new VanillaExtract();
        int answer = testObject.teaspoonsToGrams(testObject,15);
        Assert.assertEquals(75.0, answer, 0.0);
    }
}
