package mypackage;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class FileDemo03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String data = "Data related to file NIO";
		Files.write(Paths.get("D:\\Java\\SeptemberWeekdays\\TestNIO.txt"),data.getBytes());
        
		List<String> lines = Arrays.asList("This is line 1", "This is line 2");
		Files.write(Paths.get("MyNewFile.Text"), lines, StandardCharsets.UTF_8,
				StandardOpenOption.CREATE, StandardOpenOption.APPEND);
		System.out.println("File Created And Data Returns");
				
	}

}
