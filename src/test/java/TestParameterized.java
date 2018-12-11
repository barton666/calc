import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class TestParameterized {

    private int valueA;
    private int valueB;
    private int expected;

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

    @Test
    public void ParamTest(){
        Assert.assertEquals(expected, calculatortests.Sum(valueA, valueB));
    }
}



