import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    Lion lion;

    @Mock
    Feline feline;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getKittensShouldReturnOne() {
        lion = new Lion(feline);
        Mockito.when(lion.getKittens()).thenReturn(1);
        int actualResult = lion.getKittens();
        assertEquals(1, actualResult);
    }

    @Test(expected = Exception.class)
    public void doesHaveManeShouldThrowExceptionWhenIncorrectSex() throws Exception {
        lion = new Lion("Некорректный пол");
        lion.doesHaveMane();
    }

    @Test
    public void getFoodShouldReturnFoodList() throws Exception {
        lion = new Lion(feline);
        Mockito.when(lion.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualFood = lion.getFood();
        assertEquals(3, actualFood.size());
    }
}
