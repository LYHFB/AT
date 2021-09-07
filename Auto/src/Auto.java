import Login.DriverInit;
import Login.Login;
import ReportService.HomeManagement.DatabaseFastAnalysis;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Auto {



    public static void main(String args[]) throws InterruptedException {

        //指定驱动的类型与地址
        String driverType = "webdriver.chrome.driver";
        String driverPath = "D:\\google\\chromedriver.exe";
        //指定用户名密码
        String userName = "15892839023";
        String password = "123654";
        //指定网址
        String url = "https://rzhtest.polaris.pub/#/user/login";
        //初始化驱动
        WebDriver driver = new DriverInit().driverInit(driverType,driverPath);
        //登录
        new Login().Login(driver,url,userName,password);

        /* ******************************************* 调试区 ********************************************** */

        //数据库快速分析
        new DatabaseFastAnalysis().databaseFastAnalysis(driver);





        /* ******************************************* 调试区 ********************************************** */
        /* ********************************************* 新建计划 **********************************************************

        Thread.sleep(6000);
        System.out.println("新建计划");
        //计划
        driver.findElement(By.xpath("//span[text()='调度管理']")).click();
        driver.findElement(By.xpath("//span[text()='计划设计']")).click();
        driver.findElement(By.linkText("计划定义")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//span[text()='计划定义' and @style=\"color: rgb(51, 51, 51); font-size: 16px;\"]/../following-sibling::div//span[text()='新建']")).click();
        //  driver.findElement(By.xpath("//span[text()='物理方案']")).click();
        driver.findElement(By.xpath("//div[text()='新建计划']/../following-sibling::div//input[@id='planName']")).sendKeys("计划_接口自动化");
        driver.findElement(By.xpath("//div[text()='新建计划']/../following-sibling::div//input[@id='planCode']")).sendKeys("JH-JKZDH");
        driver.findElement(By.xpath("//div[text()='新建计划']/../following-sibling::div//span[text()='确 定']")).click();

        driver.findElement(By.xpath("//span[text()='调度管理']")).click();

        System.out.println("新建接口");
        //新建接口并加入计划
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()='接口管理']")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("接口定义")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='接口定义' and @style=\"color: rgb(51, 51, 51); font-size: 16px;\"]/../following-sibling::div//span[text()='新建']")).click();
        //  driver.findElement(By.xpath("//span[text()='物理方案']")).click();
        driver.findElement(By.id("relationCode")).sendKeys("INF_TEST_ZDH");
        driver.findElement(By.id("dataType")).click();
        driver.findElement(By.xpath("//div[@title='数据插入-删除表数据']")).click();
        driver.findElement(By.id("remarks")).sendKeys("接口UI测试");
        driver.findElement(By.id("scriptsExamingWay")).click();
        driver.findElement(By.xpath("//div[text()='JSQLPARSER']")).click();
        // driver.findElement(By.xpath("//div[@class='ant-legacy-form-item-control has-success']")).click();
        driver.findElement(By.xpath("//label[@title='目标表名']/../following-sibling::div//span[@class='anticon anticon-search']")).click();

        WebElement tname = driver.findElement(By.xpath("//td[text()='T_WLFA_ZDH']"));

        Actions action1 = new Actions(driver);
        action1.doubleClick(tname).perform();
        driver.findElement(By.xpath("//span[text()='下一步']")).click();

        driver.findElement(By.xpath("//span[text()='下一步']")).click();
        driver.findElement(By.xpath("//span[text()='接口定义' and @style=\"color: rgb(51, 51, 51); font-size: 16px;\"]/../following-sibling::div//span[text()='新建']")).click();
        driver.findElement(By.xpath("//input[@placeholder='请选择' and @class='ant-input' and  @type='text' and @value='']/following-sibling::span//span[@class='anticon anticon-search']")).click();


        Thread.sleep(1000);
        // Actions action = new Actions(driver);
        WebElement stable = driver.findElement(By.xpath("//td[text()='T_WLFA_ZDH']"));
        System.out.print(stable);
        action.doubleClick(stable).perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='保 存']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='确 定']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"if_relation_rule\"]/div/div[2]/div[2]/div/div/div[1]/button[1]/span[2]")).click();
        //键盘输入
        Actions rulecode = new Actions(driver);
        rulecode.sendKeys("RULE_TEST_ZDH1").perform();
        rulecode.sendKeys(Keys.ENTER).perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[text()='RULE_TEST_ZDH1']/../following-sibling::td//div[@class='editable-cell-value-wrap']")).click();
        rulecode.sendKeys("行规则自动化").perform();
        driver.findElement(By.xpath("//div[text()='RULE_TEST_ZDH1']/../following-sibling::td[2]//div[@class='editable-cell-value-wrap']")).click();
        rulecode.sendKeys("1=1").perform();
        WebElement jyfs = driver.findElement(By.xpath("//div[text()='RULE_TEST_ZDH1']/../following-sibling::td[3]//div[@class='editable-cell-value-wrap']"));
        action.doubleClick(jyfs).perform();
        driver.findElement(By.xpath("//div[text()='JSQLPARSER']")).click();
        driver.findElement(By.xpath("//div[text()='RULE_TEST_ZDH1']/../following-sibling::td[4]//div[@class='editable-cell-value-wrap']")).click();
        rulecode.sendKeys("1").perform();
        driver.findElement(By.xpath("//span[text()='批量保存']")).click();
        Thread.sleep(4000);
        // ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //向下拉到底//
        System.out.print("in");
        //js.executeScript("document.getElementsByClassName('scroll-wrapped')[1].scrollTop=10000");
        action.sendKeys(Keys.DOWN).perform();
        action.sendKeys(Keys.DOWN).perform();
        action.sendKeys(Keys.DOWN).perform();
        action.sendKeys(Keys.DOWN).perform();
        System.out.print("out");
        Thread.sleep(4000);
        //driver.findElement(By.xpath("//*[@id=\"if_relation_rule\"]/div/div[3]/div[2]/div/div/div[1]/button[1]/span[2]")).click();
        driver.findElement(By.xpath("//span[text()='初始化目标字段']")).click();
        driver.findElement(By.xpath("//span[text()='来源和目标匹配']")).click();
        driver.findElement(By.xpath("//*[@id=\"if_relation_rule\"]/div/div[3]/div[2]/div/div/div[1]/button[3]/span")).click();
        driver.findElement(By.xpath("//div[text()='RULE_TEST_ZDH1']/../preceding-sibling::td//span[@class='ant-checkbox']")).click();
        driver.findElement(By.xpath("//span[text()='校验脚本']")).click();

        driver.findElement(By.xpath("//span[text()='返 回']")).click();

        driver.findElement(By.xpath("//td[text()='INF_TEST_ZDH']/preceding-sibling::td//span[@class='ant-checkbox']")).click();
        driver.findElement(By.xpath("//span[text()='接口定义' and @style=\"color: rgb(51, 51, 51); font-size: 16px;\"]/../following-sibling::div//span[text()='更多操作 ']")).click();
        driver.findElement(By.xpath("//li[text()='添加任务']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@placeholder='计划选取LOV' and @class='ant-input' and  @type='text' and @value='']/following-sibling::span//span[@class='anticon anticon-search']")).click();

        driver.findElement(By.id("planCode")).sendKeys("JH-JKZDH");
        driver.findElement(By.xpath("//span[text()='查 询']")).click();
        Thread.sleep(4000);
        WebElement jh = driver.findElement(By.xpath("//td[text()='JH-JKZDH']"));
        action.doubleClick(jh).perform();
        Thread.sleep(4000);
        //js.executeScript("document.getElementsByClassName('scroll-wrapped')[2].scrollTop=10000");
        action.sendKeys(Keys.DOWN).perform();
        action.sendKeys(Keys.DOWN).perform();
        action.sendKeys(Keys.DOWN).perform();
        action.sendKeys(Keys.DOWN).perform();
        action.sendKeys(Keys.DOWN).perform();
        action.sendKeys(Keys.DOWN).perform();
        action.sendKeys(Keys.DOWN).perform();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//td[text()='计划_接口自动化']/preceding-sibling::td//input[@class='ant-checkbox-input']")).click();

        driver.findElement(By.xpath("//span[text()='保 存']")).click();
         ********************************************* 新建计划 ********************************************************** **/

    }
    // driver.quit();
}
