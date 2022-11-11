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

String User_Password="secret_sauce";


driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(User_name);
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(User_Password);
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();



List<WebElement> Listadd =driver.findElements(By.className("btn"));
for(int i=0;i<Listadd.size();i++) {
Listadd.get(i).click();
}
int expectedtittle=6;
String acctualtittle=driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).getText();

Thread.sleep(2000);
Assert.assertEquals(acctualtittle, expectedtittle);
System.out.println(acctualtittle);

	}

}
