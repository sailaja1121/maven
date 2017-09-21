package datadrivenpackage;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Readmutiplerows {
	public static void main(String[] args) throws Exception, IOException {
		File f=new File("C:\\Users\\DELL\\Desktop\\Book1.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet s1=wb.getSheet(1);
		//get row count
		int rows=s1.getRows();
		for(int i=0; i<rows; i++)
		{
			String un=s1.getCell(0,i).getContents();
			String pwd=s1.getCell(1,i).getContents();
			System.out.println(un+""+pwd);
		}
		
	}

}
