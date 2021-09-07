package ReportService.HomeManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DatabaseFastAnalysis {

    public void databaseFastAnalysis(WebDriver driver) throws InterruptedException {
        /* ***************************************** 数据库快速分析 ********************************************************* **/

        Thread.sleep(5000);

        driver.findElement(By.xpath("//span[text()='报表服务']")).click();

        driver.findElement(By.xpath("//span[text()='首页管理']")).click();
        Thread.sleep(500);
//        Thread.sleep(500);
//        action.sendKeys(Keys.DOWN).perform();
//        Thread.sleep(500);
//        action.sendKeys(Keys.DOWN).perform();
//        Thread.sleep(500);
//        action.sendKeys(Keys.DOWN).perform();
//        Thread.sleep(500);
//        action.sendKeys(Keys.DOWN).perform();
//        Thread.sleep(500);
//        action.sendKeys(Keys.DOWN).perform();
//        Thread.sleep(500);
//        action.sendKeys(Keys.DOWN).perform();
//        Thread.sleep(200);

        //数据库快速分析
        driver.findElement(By.xpath("//a[@href=\"#/hbr/hbr_analysis_database_fast_analysis/hbr_analysis_database_fast_analysis\"]")).click();
        Thread.sleep(500);

        driver.findElement(By.id("datasourceName")).sendKeys("GNCS0715_ORACLE");
        Thread.sleep(500);
        driver.findElement(By.xpath("//span[text()='下一步']")).click();
        Thread.sleep(500);
        driver.findElement(By.id("tableName")).sendKeys("RPT_TEST_R_FB");
        Thread.sleep(500);
        driver.findElement(By.id("tableDesc")).sendKeys("自动化测试用表");
        Thread.sleep(500);
        driver.findElement(By.id("tableAliasCode")).sendKeys("t");
        /* 同步有问题，无法继续执行 */
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//span[text()='同步']")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='下一步']")).click();
        Thread.sleep(500);
        //  查询条件添加

//        driver.findElement(By.xpath("//span[text()='添加查询条件']")).click();
//        Thread.sleep(500);
//
//        driver.findElement(By.id("queryParam_0_param")).click();
//        Thread.sleep(500);
//        driver.findElement(By.xpath("//div[@class=\"ant-select-selector\" and text()='PERIOD_CODE']")).click();
//        aria-activedescendant="queryParam_0_param_list_4"

//        driver.findElement(By.id("queryParam_0_value")).sendKeys("22");
//        Thread.sleep(500);
//        driver.findElement(By.xpath("//span[text()='查询']")).click();
//        Thread.sleep(1000);

        //  查询条件添加

        driver.findElement(By.xpath("//span[text()='下一步']")).click();

        // 选择表字段是否开启，字段是否度量，取值来源

        // 选择表字段是否开启，字段是否度量，取值来源

        driver.findElement(By.id("modelName")).sendKeys("autoTest");
        Thread.sleep(500);
        driver.findElement(By.xpath("//span[text()='下一步']")).click();
        Thread.sleep(500);
        // 拖动为指标 列维 行维

        // 拖动为指标 列维 行维

        driver.findElement(By.xpath("//span[text()='下一步']")).click();
        Thread.sleep(500);
        // 存放位置

//        driver.findElement(By.id("floderId")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//div[@class='ant-select-item-option-content' and text()='FB自动化测试']")).click();
//

        // 存放位置

        driver.findElement(By.xpath("//span[text()='下一步']")).click();
        Thread.sleep(100);

        Thread.sleep(500);

        System.out.println("数据库快速分析 自动化测试完成");

    }
}
