package datadrivenpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub	
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Downloads\\geckodriver-v0.17.0-win64//geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();		
			WebDriverWait wait=new WebDriverWait(driver,20);
			driver.get("https://www.flipkart.com/");
			 wait.until(ExpectedConditions.titleIs("Online Shopping Site for Mobiles, Fashion, Books, Electronics, Home Appliances and More"));
			Thread.sleep(2000);
			WebElement ele=driver.findElement(By.xpath("//html/body/div[1]/div/header/div[2]/div/ul/li[1]/a/span"));
			WebElement app=driver.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[2]/a"));
			WebElement men=driver.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[3]/a/span"));
			WebElement women=driver.findElement(By.xpath("//*[@id='container']/div/header/div[2]/div/ul/li[4]/a/span"));
			WebElement bk=driver.findElement(By.xpath("//*[@id='container']/div/header/div[2]/div/ul/li[5]/a"));
		WebElement hf=driver.findElement(By.xpath("//*[@id='container']/div/header/div[2]/div/ul/li[6]/a/span"));
		WebElement bm=driver.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[7]/a/span"));
		WebElement oz=driver.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[8]/a/span"));
		if(ele.isDisplayed() && app.isDisplayed())
		{
			System.out.println("Electronic and applications are displayed");
		}
			else
			{
				System.out.println("Electronic and applicatiopns are not displayde");
			}
		if(men.isDisplayed() && women.isDisplayed())
		{
			System.out.println("men and women are displayed");
		}
		else
		{
			System.out.println("men and women are not displayed");
		}
		if(bk.isDisplayed() && hf.isDisplayed())
		{
			System.out.println("babykids and homefurniture are displayed");
		}
		else
		{
			System.out.println("babykids and homefurniture are not displayed");
		}
		if(bm.isDisplayed() && oz.isDisplayed())
		{
		System.out.println("booksmore and offerzone are displayed ");
		}
		else
		{
			System.out.println("booksmore and offerzone are displayed");
		}
		
		 Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.moveToElement(ele).click().perform();
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='container']/div/header/div[2]/div/ul/li[1]/a/span")));
		 
		
		 
		 //WebElement electronic=driver.findElement(By.xpath("//*[@id='container']/div/header/div[2]/div/ul/li[1]/a/svg"));
		 //act.moveToElement(electronic).click().perform();
		 Thread.sleep(2000);
		 WebElement samsung=driver.findElement(By.xpath("//*[@id='container']/div/header/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[2]/a/span"));
		 act.click(samsung).perform();
		 Thread.sleep(2000);
		 WebElement high=driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div/div[2]/div/div[2]/div/div[2]/div/section/ul/li[3]"));
				 
		
		}
		
		{
			

		}

	


	}


