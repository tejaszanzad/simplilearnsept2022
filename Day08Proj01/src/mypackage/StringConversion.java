package mypackage;

public class StringConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Conversion Of String To StringBuffer And StringBuilder");
		String str = "Hello";
		
		//Conversion From String Object To StringBuffer
		StringBuffer sbr = new StringBuffer(str);
		sbr.reverse();
		System.out.println("String to StringBuffer");
		System.out.println(sbr);
		
		//Conversion From String Object To StringBuilder
		StringBuilder sbl = new  StringBuilder(str);
		sbl.append("World");
		System.out.println("String To StringBuilder");
	    System.out.println(sbl);
		
	}

}
