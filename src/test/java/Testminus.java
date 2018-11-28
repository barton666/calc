import org.junit.*;


public class Testminus {

    @Test
    public void testEquals1(){
        Assert.assertEquals( "Здесь должно быть 5",5, calculatortests.Minus(10, 5));
    }

    @Test
    public void testEquals2 (){
        Assert.assertEquals("Здесь должно быть 40",40, calculatortests.Minus(27, -13));
    }

    @Test
    public void  testEquals3 (){
        Assert.assertEquals("Здесь должно быть -10",-10, calculatortests.Minus(10, 20));
    }
}
