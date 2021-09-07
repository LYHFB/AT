package ReportService.HomeManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExcelFastAnalysis {

    public void excelFastAnalysis(WebDriver driver) throws InterruptedException {
        /* ***************************************** EXCEL快速分析 ********************************************************* **/

        driver.findElement(By.xpath("//span[text()='报表服务']")).click();

        driver.findElement(By.xpath("//span[text()='首页管理']")).click();
        Thread.sleep(500);

        //EXCEL快速分析
        driver.findElement(By.xpath("//a[@href=\"#/hbr/hbr_analysis_fast_analysis/hbr_analysis_fast_analysis\"]")).click();
        Thread.sleep(500);




        /* ***************************************** EXCEL快速分析 ********************************************************* **/
    }
}
