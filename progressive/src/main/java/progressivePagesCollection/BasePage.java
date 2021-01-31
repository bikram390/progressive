package progressivePagesCollection;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class BasePage {
	
	
	 static WebDriver driver;
	
	 public static HomePage hp;
	 public static ZipCodePage zp;
	 public static CustomerInfoPage cp;
	 public static VachalInfoPage vp;
	 public static DriverInfoPage dp;
	 public static DetailPage dpp;
	

	public void invokeBrowser() {
			System.setProperty("webdriver.chrome.driver", ".\\libis\\chromedriver.exe");
			 driver = new ChromeDriver();
			driver.get("https://www.progressive.com/");
			driver.manage().window().maximize();
			
			
			/*
			 * driver.findElement(By.xpath("//a[@data-qs-product='AU']")).click();
			 * WebElement zipCode = driver.findElement((By)
			 * By.xpath("//input[@id='zipCode_overlay']")); zipCode.sendKeys("40509");
			 * zipCode.submit();
			 * 
			 * FillPage fillPage = new FillPage(driver); fillPage.typefirstName();
			 * fillPage.typeLastName(); fillPage.typeDateOfBirth();
			 * fillPage.typeStreetNumberAndName(); fillPage.clickOnOkButton();
			 * 
			 */
			}
	
	@BeforeMethod
	public void setUp() {
		
		invokeBrowser();
		hp = new HomePage();
		zp = new ZipCodePage();
		cp = new CustomerInfoPage();
		vp = new VachalInfoPage();
		dp = new DriverInfoPage();
		dpp = new DetailPage();
		
	}
		
	@AfterMethod
	public void close() {
		//driver.close();
	}
		
	

}
