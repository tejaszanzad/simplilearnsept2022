package mypackage;

import java.util.regex.*;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pattern.matches("Hello","Hello"));
		System.out.println(Pattern.matches("[a-z]","Hello"));
		System.out.println(Pattern.matches("Simp*ilearn","Simplilearn"));

	}

}
