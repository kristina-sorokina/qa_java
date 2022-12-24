import com.example.Animal;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalGetFoodTest {
    Animal animal;
    private final List<String> expectedFood;
    private final String animalType;

    public AnimalGetFoodTest(List<String> expectedFood, String animalType) {
        this.expectedFood = expectedFood;
        this.animalType = animalType;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {List.of("Трава", "Различные растения"), "Травоядное"},
                {List.of("Животные", "Птицы", "Рыба"), "Хищник"}
        };
    }

    @Before
    public void setUp() {
        animal = new Animal();
    }

    @Test
    public void getFood() throws Exception {
        List<String> actualFood = animal.getFood(animalType);
        assertEquals(expectedFood, actualFood);
    }
}
