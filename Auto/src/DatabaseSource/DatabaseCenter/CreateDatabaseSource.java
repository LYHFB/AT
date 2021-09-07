package DatabaseSource.DatabaseCenter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateDatabaseSource {

    public void createDatabaseSource(WebDriver driver) throws InterruptedException {
        /* ******************************************** 新建数据源 ********************************************************** **/
        driver.findElement(By.xpath("//span[text()='数据源']")).click();
        driver.findElement(By.xpath("//a[@href=\"#/dbm/dbm_datasource/dbm_datasource\"]")).click();
        driver.findElement(By.xpath("//span[text()='新建']")).click();
        //  driver.findElement(By.xpath("//span[text()='物理方案']")).click();
        driver.findElement(By.id("datasourceName")).sendKeys("SJY_ZDH");

        driver.findElement(By.id("joinType")).click();

        driver.findElement(By.xpath("//div[@class=\"ant-select-item-option-content\" and text()='JDBC']")).click();
        driver.findElement(By.id("jndiOrUrl")).sendKeys("jdbc:oracle:thin:@47.101.140.48:1521/hdmpdb");
        driver.findElement(By.id("username")).sendKeys("hdmp_bgt");
        driver.findElement(By.id("pwd")).sendKeys("hdmp_bgt");
        driver.findElement(By.id("confirmPwd")).sendKeys("hdmp_bgt");


        driver.findElement(By.id("cpType")).click();
        driver.findElement(By.xpath("//div[@class=\"ant-select-item-option-content\" and text()='Druid']")).click();
        driver.findElement(By.id("databaseType")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='ant-select-item-option-content' and text()='Oracle']")).click();

        driver.findElement(By.xpath("//span[text()='下一步']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='下一步']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='JDBC/JNDI测试']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='下一步']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='加入连接池中']")).click();
        driver.findElement(By.xpath("//span[text()='完 成']")).click();
        /* ******************************************** 新建数据源 ********************************************************** **/

    }
}
