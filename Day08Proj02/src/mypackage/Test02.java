package mypackage;

import java.util.regex.*;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a pattern to be searched
		Pattern p = Pattern.compile("java");
		
		//Search the pattern in the string below
		Matcher m = p.matcher("java is a programming language");
		
		//finding string using find method
		while(m.find() ) {
			System.out.println("Pattern Start From "+m.start()+" to "+(m.end()-1));
		}
		
	}

}
