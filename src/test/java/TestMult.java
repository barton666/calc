import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class TestMult {

    @Test
    public void Testmult1(){
        Calculator calc = new Calculator();
        Assert.assertEquals( "Умножение целых чисел",1125, calc.mult(25, 45));
    }

    @Test
    public void Testmult2(){
        Calculator calc = new Calculator();
        Assert.assertEquals( "Умножение на ноль",0, calc.mult(250, 0));
    }

//    @Test
//    public void Testmult3(){
//        Calculator calc = new Calculator();
//        Assert.assertEquals( "Умножение дробных чисел", 296.3336, calc.mult(15.37, 19.28), 0.01);
//    }
}
