package DeletingSkillsSet;
 
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
 
public class OrangeHRM {
	static WebDriver driver;
	public static Properties properties;
	public static void loginPage(WebDriver driver) throws InterruptedException
	{
	Thread.sleep(3000);
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(3000);
	System.out.println("Website Link: "+driver.getCurrentUrl());
	System.out.println("Username And Password inserted as Admin and admin123");
	
	}
	
	public static WebDriver createWebDriver(int browserType) {
		if(browserType == 1)
		{
		
			System.out.println("------Chrome Broswer Launched------");
			return new ChromeDriver();
			
		}
		else if(browserType == 2)
		{
			System.out.println("------Edge Broswer Launched------");
			return new EdgeDriver();
		}
		return null;
	}
	
	//admin login
	public static void admin(WebDriver driver)throws InterruptedException
	{
		System.out.println("Clicked on Admin Dashboard");
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(3000);	
	}
	//Job Test Scenario 
	public static void job(WebDriver driver)throws InterruptedException
	{
		driver.findElement(By.xpath("//header[@class='oxd-topbar']//li[2]")).click();
		WebElement r= driver.findElement(By.xpath("//a[text()='Job Categories']"));
		r.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		WebElement jobName = driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input"));
		jobName.sendKeys("Analyst");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		WebElement dr=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[1]/div/div[3]/div/button[1]"));
		dr.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
		Thread.sleep(3000);
		System.out.println("First Scenario: Job Added and Deleted");
	}


	//organization test scenario
	public static void organization(WebDriver driver) throws InterruptedException
	{
        /*Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[3]/span")).click();
		WebElement r= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/ul/li[2]/a"));
		r.click();
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys("Washington R&D");
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input")).sendKeys("Washington");
		Thread.sleep(3000);*/


	    //driver.findElement(By.xpath("//*[@class='oxd-form-actions']/button[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Organization ']")).click();
		WebElement r= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/ul/li[2]/a"));
		r.click();
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/input")).sendKeys("Anjali");
		//Thread.sleep(3000);
		//select country 
		driver.findElement(By.xpath("//div[@class='oxd-select-text--after']")).click();
		/*List<WebElement> options=driver.findElements(By.xpath("//div[@role='listbox']"));
	    for(WebElement ele : options)
	    {
	    	String country = ele.getText();
	    	if(country.equals("Afghanistan"))
	    	{
	    		ele.click();
	    		break;
	    	}
	    	//System.out.println(ele.getText());
	    }*/
	    //Thread.sleep(3000);
	    
	    //
	    WebElement options=driver.findElement(By.xpath("//div[@role='listbox']"));
	    options.click();
	    
	   // Thread.sleep(5000);
	    //WebElement option = driver.findElement(By.xpath("//span[normalize-space()='Afghanistan']"));
	    
	   // option.click();
	    
	    Select select = new Select(options);
	    select.selectByVisibleText("Albania");
	    Thread.sleep(3000);
	    
	   /* driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click(); //clicking save 
	    
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@role='table']//div[1]//div[1]//div[7]//div[1]//button[1]//i[1]")).click(); // delete button
	    driver.findElement(By.xpath("//button[normalize-space()='Yes, Delete']")).click();
	    
	    
	    
	    
	    
	    
	    
	    */
	    
//
		//driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
		System.out.println("Second Scenario Location Added and deleted");
		Thread.sleep(5000);
	}

 
 
	//Selecting skills page from qualifications
		public static void skills(WebDriver driver)throws InterruptedException
		{
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click(); //clicking save 
		    
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//div[@role='table']//div[1]//div[1]//div[7]//div[1]//button[1]//i[1]")).click(); // delete button
		    driver.findElement(By.xpath("//button[normalize-space()='Yes, Delete']")).click();
		    
		    //---------------------
			driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]")).click();
			WebElement r= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]/a"));
			r.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys("Testing Demo");
			driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[1]/div/div[4]/div/button[1]")).click();
			driver.findElement(By.xpath("//*[@id='app']/div[3]/div/div/div/div[3]/button[2]")).click();
			System.out.println("Third Scenario: Skill added and deleted");
			Thread.sleep(3000);

			/*List<WebElement> qualifications = driver.findElements(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul"));
			for(WebElement ele : qualifications) {
				String qual = ele.getText();
				if(qual=="Skills") {
					ele.click();
					break;
				}
			}*/
		}
    //Log out from the browser
	//public static void logOut(WebDriver driver)
	//{
	//	driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i")).click();
	//	driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[3]/a")).click();
	//}
	public static void closingBrowser(WebDriver driver)
	{
		driver.quit();
		System.out.println("------Browser closed------");
	}
 
	
		public static void main(String[] args) throws InterruptedException, IOException {
		    
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the browser type:\n1.Chrome\n2.Edge");
			int input = sc.nextInt();
			
			WebDriver driver = createWebDriver(input);
			
			//driver=new ChromeDriver();
			FileInputStream propertiesFile = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
			properties = new Properties();
			properties.load(propertiesFile);

	        String baseURL = properties.getProperty("URL");
			driver.get(baseURL);
			//Open url on the browser
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//calling login function
			loginPage(driver);
			//calling admin function
			admin(driver);
			//calling job function
			job(driver);
			//calling organization
			organization(driver);
			//calling
			skills(driver);
			//closing browser
			closingBrowser(driver);
			
			sc.close();
	 }

}