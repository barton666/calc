import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;

/*
Пример класса для реализации параметризированных тестов
*/

@RunWith(Parameterized.class)
public class TestParameterized {

    private int valueA;
    private int valueB;
    private int expected;
    private Calculator calc;

    public TestParameterized(int valueA, int valueB, int expected) {
        this.valueA = valueA;
        this.valueB = valueB;
        this.expected = expected;
    }


    @Parameters(name = "{index}: testAdd({0}+{1}) = {2}")
    public static Iterable<Object[]> DataForTest() {
        return Arrays.asList(new Object[][]{
               {34, 17, 51},
               {0, 0, 0},
               {15, -6, 9},
               {17, -25, -8}
        });
    }

    @Before
    public void before(){
        calc = new Calculator();
    }

    @Test
    public void ParamTest(){
        Assert.assertEquals(expected, calc.sum(valueA, valueB));
    }
}



