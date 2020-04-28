import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCase {
    @Test (priority = 1)
    public void start(){

        System.out.println("Open page");
    }
    @Test (priority = 4)
    public void show(){
        System.out.println("Show details");

    }

    @Test (priority = 2)
    public void login(){
        System.out.println("Show details");
        Assert.assertEquals(1,1);
    }

    @Test (priority = 3)
    public void close(){
        System.out.println("Close browser");

    }

}
