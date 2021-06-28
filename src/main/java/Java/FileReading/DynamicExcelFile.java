package Java.FileReading;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DynamicExcelFile {

	public static class Contact {

		public String firstName;
		public String lastName;
		public String email;
		public String dateOfBirth;

		public Contact(String firstName, String lastName, String email, String dateOfBirth) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.dateOfBirth = dateOfBirth;
		}

	}

	public static String[] columns = { "First Name", "Last Name", "Email", "Date Of Birth" };
	public static String excelFilePath = "/home/thyrmr/Desktop/NewFile.xlsx";
	public static List<Contact> contacts = new ArrayList<Contact>();

	@SuppressWarnings("resource")
	public static void FileCreation() throws Exception {

		contacts.add(new Contact("Sylvain", "Saurel", "sylvain.saurel@gmail.com", "17/01/1980"));
		contacts.add(new Contact("Albert", "Dupond", "sylvain.saurel@gmail.com", "17/08/1989"));
		contacts.add(new Contact("Pierre", "Dupont", "sylvain.saurel@gmail.com", "17/07/1956"));
		contacts.add(new Contact("Mariano", "Diaz", "sylvain.saurel@gmail.com", "17/05/1988"));

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Contacts");

		Font headerFont = workbook.createFont();
		headerFont.setBold(false);
		headerFont.setFontHeightInPoints((short) 12);
		headerFont.setColor(IndexedColors.RED.getIndex());

		CellStyle headerCellStyle = workbook.createCellStyle();
		headerCellStyle.setFont(headerFont);

		// Create a Row
		Row headerRow = sheet.createRow(0);

		for (int i = 0; i < columns.length; i++) {
			Cell cell = headerRow.createCell(i);
			cell.setCellValue(columns[i]);
			cell.setCellStyle(headerCellStyle);
		}

		// Create Other rows and cells with contacts data
		int rowNum = 1;

		for (Contact contact : contacts) {
			Row row = sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(contact.firstName);
			row.createCell(1).setCellValue(contact.lastName);
			row.createCell(2).setCellValue(contact.email);
			row.createCell(3).setCellValue(contact.dateOfBirth);
		}

		// Resize all columns to fit the content size
		for (int i = 0; i < columns.length; i++) {
			sheet.autoSizeColumn(i);
		}

		FileOutputStream fileOut = new FileOutputStream(excelFilePath);
		workbook.write(fileOut);
		fileOut.close();
	}

	public static void main(String[] args) throws Exception {
		FileCreation();
	}

}
