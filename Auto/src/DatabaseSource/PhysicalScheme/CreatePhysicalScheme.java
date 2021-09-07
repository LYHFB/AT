package DatabaseSource.PhysicalScheme;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class CreatePhysicalScheme {

    public void createPhysicalScheme(WebDriver driver) {
        /* ******************************************* 新建物理方案 ********************************************************* **/
        //物理方案
        Actions action = new Actions(driver);
        driver.findElement(By.xpath("//span[text()='数据源']")).click();
        driver.findElement(By.xpath("//span[text()='物理方案']")).click();
        driver.findElement(By.linkText("物理方案配置")).click();
        driver.findElement(By.xpath("//span[text()='新建分组']")).click();
        driver.findElement(By.id("folderName")).sendKeys("UI自动化测试");
        driver.findElement(By.xpath("//span[text()='确 定']")).click();
        driver.findElement(By.xpath("//span[text()='UI自动化测试']")).click();
        driver.findElement(By.xpath("//*[@id=\"dbm_table_list\"]/div/div/div[1]/div/div[1]/div/div[2]/div[1]/a/img")).click();
        driver.findElement(By.id("form_tableName")).sendKeys("T_WLFA_ZDH");
        driver.findElement(By.id("form_tableDesc")).sendKeys("物理方案自动化");
        driver.findElement(By.id("form_dsId")).click();

        action.sendKeys(Keys.UP).perform();
        driver.findElement(By.xpath("//div[@title=\"SJY_ZDH\"]")).click();
        driver.findElement(By.xpath("//span[text()='下一步']")).click();
        driver.findElement(By.xpath("//span[text()='添 加']")).click();
        driver.findElement(By.xpath("//input[@class='ant-input-number-input'and @value='1']/../../../preceding-sibling::td[5]//input[@class='ant-input ant-input-sm']")).sendKeys("CODE");
        driver.findElement(By.xpath("//span[text()='下一步']")).click();
        driver.findElement(By.xpath("//span[text()='保 存']")).click();
        /* ******************************************* 新建物理方案 ********************************************************* **/
    }
}
