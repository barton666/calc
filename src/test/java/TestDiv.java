import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/*
Класс, содержащий тесты по проверке операции сложения
*/

@Category(MultDivCategory.class)
public class TestDiv {

    private Calculator calc;

    @Before
    public void before(){
        calc = new Calculator();
    }

    @Test
    public void testDiv1(){
        Assert.assertEquals("Деление простых чисел", 5,calc.div(15, 3));

    }

    @Test
    public void testDiv2(){
        Assert.assertEquals("Деление дробных чисел", 2.35,calc.div(19.3405, 8.23), 0.01);
    }

    @Test
    public void testDiv3() {
        try{
            calc.div(15, 0);
        }
        catch (NumberFormatException e){
            Assert.assertEquals("Attempt to divide by zero",e.getMessage());
        }
    }

}
