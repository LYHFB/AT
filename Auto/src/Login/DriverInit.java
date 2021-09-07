package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverInit {

    public WebDriver driverInit(String driverType,String driverPath){
        System.setProperty(driverType, driverPath);
        //实例化一个WebDriver的对象，此时会启动浏览器
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //最大化浏览器窗口
        driver.manage().window().maximize();
        return driver;
    }
}
