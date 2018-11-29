
import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class Testmult {



    @Test
    public void testEquals1(){
        Calculator calc = new Calculator();
        Assert.assertEquals( "Здесь должно быть 5",5, calc.mult(1, 5));
    }

    @Test
    public void testEquals2(){
        Calculator calc = new Calculator();
        Assert.assertEquals( "Умножение на ноль",0, calc.mult(250, 0));
    }

    @Test
    public void testEquals3(){
        Calculator calc = new Calculator();
        Assert.assertEquals( "Переменожение двух дробных чисел",1615.7, calc.mult(12.5, 129.256));
    }


}