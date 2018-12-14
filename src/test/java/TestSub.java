import com.epam.tat.module4.Calculator;
import org.junit.*;
import org.junit.experimental.categories.Category;

/*
Класс, содержащий тесты по проверке операции вычитания
*/

@Category(SumSubCategory.class)
public class TestSub {

    private Calculator calc;

    @Before
    public void before(){
        calc = new Calculator();
    }

    @Test
    public void testEquals1(){

        Assert.assertEquals( "Вычитание целых положительных чисел",5, calc.sub(10, 5));
    }


    @Test
    public void testEquals2 (){

        Assert.assertEquals("Вычитание положительных и отрицательных целых чисел",40, calc.sub(27, -13));
    }

    @Test
    public void  testEquals3 (){

        Assert.assertEquals("Вычитание дробных чисел",8.582, calc.sub(-135.1769, -143.7589), 0.0001);
    }
}
