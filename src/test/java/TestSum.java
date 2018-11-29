import org.junit.Assert;
import org.junit.Test;

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
    public void  testEquals6 (){
        Assert.assertEquals("Здесь должно быть 30",30, calculatortests.Sum(10, 20));
    }


}
