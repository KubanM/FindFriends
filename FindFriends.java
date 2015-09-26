package facebook;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FindFriends {

	WebDriver driver = new FirefoxDriver();
//	WebDriver driver = new ChromeDriver();

	@Before
	public void setUp() throws Exception {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() {
		driver.findElement(By.id("email")).sendKeys("sqaengineer2015@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("qa2015engineer");
		driver.findElement(By.id("u_0_x")).click();
		
		String userName = driver.findElement(By.className("_2dpb")).getText();
		assertEquals("Qapro", userName);
		
		System.out.println(userName);
		
		driver.findElement(By.className("_586i")).clear();
		driver.findElement(By.className("_586i")).sendKeys("Jeff Radom");
				
		driver.findElement(By.cssSelector("._42ft._42fu._4w98")).click();
		
		String friendName = driver.findElement(By.xpath("//div[*/text() = 'Jeff Radom']")).getText();
		
		System.out.println(friendName);
		
		assertEquals("Jeff Radom", friendName);
				
	}

}
