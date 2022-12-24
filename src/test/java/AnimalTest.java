import com.example.Animal;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {
    Animal animal;

    @Before
    public void setUp() {
        animal = new Animal();
    }

    @Test
    public void getFamily() {
        String expectedResult = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actualResult = animal.getFamily();
        assertEquals(expectedResult, actualResult);
    }

    @Test(expected = Exception.class)
    public void getFoodShouldThrowExceptionWhenIncorrectType() throws Exception {
        animal.getFood("Incorrect");
    }
}