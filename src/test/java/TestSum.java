import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/*
Класс, содержащий тесты по проверке операции сложения
*/

@Category(SumSubCategory.class)
public class TestSum {

    private Calculator calc;

    @Before
    public void before(){
        calc = new Calculator();
    }

    @Test
    public void testEquals4(){

        Assert.assertEquals( "Сложение положительных целых чисел",15, calc.sum(10, 5));
    }

    @Test
    public void testEquals5 (){

        Assert.assertEquals("Сложение положительных и отрицательных целых чисел",-14, calc.sum(13, -27));
    }

    @Test
    public void testEquals6 (){

        Assert.assertEquals("Сложение дробных чисел",458.6, calc.sum(7.35, 451.25), 0.001);
    }
    }

