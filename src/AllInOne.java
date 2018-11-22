import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AllInOne {
	static WebDriver driver;
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			String path = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.tutorialspoint.com/");
			
			Thread.sleep(3000);
			
			String title = driver.getTitle();
			
			Assert.assertTrue(title.contains("Parallax"));
			
			driver.quit();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
