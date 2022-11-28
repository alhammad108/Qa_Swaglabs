import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Qatest_Swag {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.get("https://www.saucedemo.com/");
driver.manage().window().maximize();

String User_name="standard_user";

String User_password="secret_sauce";


driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(User_name);
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(User_password);
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();



List<WebElement> Listadd =driver.findElements(By.className("btn"));
for(int i=0;i<Listadd.size();i++) {
Listadd.get(i).click();
}
int expectedTittle=6;
String acctualTittle=driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).getText();

Thread.sleep(2000);
Assert.assertEquals(acctualTittle, expectedTittle);
System.out.println(acctualTittle);

	}

}
