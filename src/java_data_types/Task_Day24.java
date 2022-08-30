package java_data_types;

public class Task_Day24 {

	public static void
	printMiddleCharacter(String str) {
		
		
		int len = str.length();
		
		int middle = len /2;
		 System.out.println(str.charAt(middle));
	}
	
	
	
	public static void main(String[] args) {
	
		String str = "Butterfly";
		
		printMiddleCharacter(str);
		
		
		
	}

}
