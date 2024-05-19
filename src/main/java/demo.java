

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v118.input.Input;
import org.openqa.selenium.support.ui.Select;

public class demo {
    public static void main(String[] args) throws InterruptedException {
         WebDriver driver = new ChromeDriver();
         driver.get("http://10.105.196.11:7002/auth/login?tab=1");
         driver.manage().window().maximize();
         driver.manage().deleteAllCookies();
         driver.findElement(By.id("userId")).sendKeys("1231231234");
         driver.findElement(By.id("submitBtn")).click();
         Thread.sleep(5000);
         driver.findElement(By.cssSelector("button[id=\"SystemManager-btn\"]")).click();
         Thread.sleep(5000);
         driver.findElement(By.id("MunicipalityDirector-btn")).click();
         Thread.sleep(5000);
         driver.findElement(By.xpath("//button[@id='MunicipalityDirector-btn']")).click();
         /*driver.findElement(By.xpath("//*[@href='/admin/secondary-inespection']")).click();
         driver.findElement(By.id("addNewUser")).click();
         driver.findElement(By.id("name")).sendKeys("تجربة اوتوميشن");
         Thread.sleep(2000);
         driver.findElement(By.className("ng-input")).click();
         Thread.sleep(2000);
         driver.findElement(By.cssSelector("div[class=\"ng-option\"]")).click();
         //Select active = new Select(driver.findElement(By.className("ng-input")));
         //active.selectByVisibleText("غير مفعل ");
         //Thread.sleep(5000);
         //driver.findElement(By.className("ng-input"));
         //driver.findElement(By.id("a7352afdf8b7-0")).click();
         //Thread.sleep(5000);
         driver.findElement(By.id("submitBtn")).click();*/






    }
}
