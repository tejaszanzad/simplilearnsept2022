package mypackage;

import java.io.*;

public class FileDemo02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String data = "Hey Folks We Are Discussing FileOutputStream Class";
		FileOutputStream obj = new FileOutputStream("D:\\Java\\SeptemberWeekdays\\TestFile.txt");
		obj.write(data.getBytes());
		obj.close();
		System.out.println("Data Written To The File");
	}

}
