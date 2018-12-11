import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(SumSubCategory.class)
public class TestSum {

    @Test
    public void testEquals4(){
        Assert.assertEquals( "Здесь должно быть 15",15, calculatortests.Sum(10, 5));
    }

    @Test
    public void testEquals5 (){
        Assert.assertEquals("Здесь должно быть -14",-14, calculatortests.Sum(13, -27));
    }

    @Test
    public void testEquals6 (){
        Assert.assertEquals("Здесь должно быть 458",458, calculatortests.Sum(7, 451));
    }
    }

