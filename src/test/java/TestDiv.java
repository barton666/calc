import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.fail;

public class TestDiv {

    @Test
    public void testDiv1(){
        Calculator calc = new Calculator();
        Assert.assertEquals("Деление простых чисел", 5,calc.div(15, 3));
    }

    @Test
    public void testDiv2(){
        Calculator calc = new Calculator();
        Assert.assertEquals("Деление дробных чисел", 2.35,calc.div(19.3405, 8.23), 0.01);
    }

    @Test
    public void testDiv3() {
        Calculator calc = new Calculator();
        try{
            calc.div(15, 0);
            fail("where is exception, Lebowski??!!");
        }
        catch (NumberFormatException e){
            Assert.assertEquals("Attempt to divide by zero",e.getMessage());
        }

    }

}
