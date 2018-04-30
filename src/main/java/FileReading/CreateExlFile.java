package FileReading;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateExlFile {
	public static void main(String[] args) throws Exception {
		// createHSSFWorkbook();
		// createXSSFWorkbook();
		ReadAndWritePages();
	}

	public static void createHSSFWorkbook(int index, String header) {
		try {
			String filename = "/home/thyrmr/Desktop/NewHSSFWorkbook.xls";
			@SuppressWarnings("resource")
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("FirstSheet");

			HSSFRow rowhead = sheet.createRow(0);
			rowhead.createCell(index).setCellValue(header);

			HSSFRow row = sheet.createRow(1);
			row.createCell(index).setCellValue(header);

			FileOutputStream fileOut = new FileOutputStream(filename);
			workbook.write(fileOut);
			// fileOut.flush();
			fileOut.close();

		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public static void ReadAndWritePages() {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/home/thyrmr/Desktop/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.seleniumeasy.com/test/table-search-filter-demo.html");
		driver.manage().window().maximize();
		WebElement headings = driver.findElement(By.xpath("//*[@id='task-table']/thead/tr"));
		List<WebElement> headingsList = headings.findElements(By.tagName("th"));
		for (int i = 0; i < headingsList.size(); i++) {
			System.out.println(headingsList.get(i).getText());
			createHSSFWorkbook(i, headingsList.get(i).getText());
		}
		WebElement content = driver.findElement(By.xpath("//*[@id='task-table']/tbody"));
		List<WebElement> contentList = content.findElements(By.tagName("td"));
		for (int j = 0; j < contentList.size(); j++) {
			createHSSFWorkbook(j, contentList.get(j).getText());
		}

	}

	public static void createXSSFWorkbook() throws Exception {
		try {
			String filename = "/home/thyrmr/Desktop/NewXSSFWorkbook.xlsx";
			FileOutputStream fos = new FileOutputStream(filename);
			@SuppressWarnings("resource")
			XSSFWorkbook workbook = new XSSFWorkbook();

			XSSFSheet sheet = workbook.createSheet("fund");

			Row row = sheet.createRow(0);
			Cell cell0 = row.createCell(0);
			cell0.setCellValue("Nav Value");

			Cell cell1 = row.createCell(1);

			cell1.setCellValue("Amount Change");

			Cell cell2 = row.createCell(2);
			cell2.setCellValue("Percent Change");

			workbook.write(fos);
			fos.flush();
			fos.close();
			System.out.println("Your excel file has been generated!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
