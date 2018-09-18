package Java.IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateAndWriteFile {

	/**
	 * This method creates an empty file, if the file doesn’t exist at the
	 * specified location and returns true. If the file is already present then
	 * this method returns false.
	 */
	public static class CreateFile {
		public static void main(String[] args) {
			try {
				File file = new File("Newfile.txt");
				/*
				 * If file gets created then the createNewFile() method would
				 * return true or if the file is already present it would return
				 * false
				 */
				boolean fvar = file.createNewFile();
				if (fvar) {
					System.out.println("File has been created successfully");
				} else {
					System.out.println("File already present at the specified location");
				}
			} catch (IOException e) {
				System.out.println("Exception Occurred:");
				e.printStackTrace();
			}
		}
	}

	public static class WriteFile {

		public static void main(String[] args) {
			FileOutputStream fos = null;
			File file;
			String mycontent = "This is my Data which needs" + " to be written into the file";
			try {
				// Specify the file path here
				file = new File("Newfile.txt");
				fos = new FileOutputStream(file);

				/*
				 * This logic will check whether the file exists or not. If the
				 * file is not found at the specified location it would create a
				 * new file
				 */
				if (!file.exists()) {
					file.createNewFile();
				}

				/*
				 * String content cannot be directly written into a file. It
				 * needs to be converted into bytes
				 */
				byte[] bytesArray = mycontent.getBytes();

				fos.write(bytesArray);
				fos.flush();
				System.out.println("File Written Successfully");
			} catch (IOException ioe) {
				ioe.printStackTrace();
			} finally {
				try {
					if (fos != null) {
						fos.close();
					}
				} catch (IOException ioe) {
					System.out.println("Error in closing the Stream");
				}
			}
		}
	}
}
