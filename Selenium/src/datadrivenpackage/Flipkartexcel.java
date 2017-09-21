package datadrivenpackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Flipkartexcel {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Downloads\\geckodriver-v0.17.0-win64\\GeckoDriver.exe");
   WebDriver brow=new FirefoxDriver();
   brow.manage().window().maximize();
   WebDriverWait wait=new WebDriverWait(brow,20);
   brow.get("https://www.flipkart.com/");
   File fis=new File("C:\\Users\\DELL\\Desktop\\sailu.xls");
   Workbook wb=Workbook.getWorkbook(fis);
   Sheet InputSheet=wb.getSheet(1);
   //write data objects
   WritableWorkbook wb1=Workbook.createWorkbook(new File(""));
   WritableSheet outputSheet=wb1.createSheet("firefox",0);
 
   Label i=new Label(0,0,"browser" );
   		
   		
   Label i1=new Label(2,1,"");
   Label i2=new Label(3,1,"");
   
   
   
   
   
   
   
   
	}

}
