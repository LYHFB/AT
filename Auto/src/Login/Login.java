package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Login {

    public void Login(WebDriver driver,String url,String userName,String password) throws InterruptedException {

        /* *********************************************** 登录 ************************************************************ **/
        //登录
        driver.get(url);
        //  Thread.sleep(6000);
        driver.findElement(By.id("username")).sendKeys(userName);
        driver.findElement(By.id("custom-pwd")).sendKeys(password);
        driver.findElement(By.className("ant-btn-primary")).click();
        /* *********************************************** 登录 ************************************************************ **/

    }
}
