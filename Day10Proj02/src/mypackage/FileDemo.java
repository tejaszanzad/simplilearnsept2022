package mypackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File obj = new File("D:/Java/SeptemberWeekdays/MySeptemeberFile.txt");
		//create new file
		if(obj.createNewFile()){
			System.out.println("File Created");
		}
		else {
			System.out.println("File Already Exists");
		}
		//write content to the file
		FileWriter writer = new FileWriter(obj);
		writer.write("Test Data");
		writer.close();
		System.out.println("Data Written To The File");
		
	}

}
