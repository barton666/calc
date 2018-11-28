
import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class Testmult {



    @Test
    public void testEquals1(){
        Calculator calc = new Calculator();
        Assert.assertEquals( "Здесь должно быть 5",5, calc.mult(1, 5));
    }




}