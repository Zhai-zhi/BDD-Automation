import org.testng.annotations.Test;

public class FirstTestCase {
    @Test(priority = 1)
    public void start(){
        System.out.println("Open page");
    }
    @Test (priority = 2)
    public void login(){
        System.out.println("login");

    }

}
