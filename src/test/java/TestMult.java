import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/*
Класс, содержащий тесты по проверке операции деления.
*/

@Category(MultDivCategory.class)
public class TestMult {

    private Calculator calc;

    @Before
    public void before(){
        calc = new Calculator();
    }

    @Test
    public void Testmult1(){
        Assert.assertEquals( "Умножение целых чисел",1126, calc.mult(25, 45));
    }

    @Test
    public void Testmult2(){
        Assert.assertEquals( "Умножение на ноль",0, calc.mult(250, 0));
    }

    @Test
    public void Testmult3(){
        Assert.assertEquals( "Умножение дробных чисел", 296.3336, calc.mult(15.37, 19.28), 0.001);
    }
}
