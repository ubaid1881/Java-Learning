package java_data_types;

public class Day24_MoreStrings {
	
	public static void main(String[] args) {
		

		String fname = "Muhammad ";
		String lname = "Ubaid";
		String fullname = fname.concat(lname);

		System.out.println(fullname);
		
		String day = " Today we are learning            Strings  ";
		day = day.trim();

		if(day.equals("Today we are learning Strings")) {
			System.out.println("Yayy, the string value matched. ");
		} else {
			System.out.println("The value does not match");
		}
		
		String transaction = "$50.00";
		boolean dollarSymbol = transaction.startsWith("$");
		if(dollarSymbol) { 
			System.out.println("The prefix is present");
		} else {
			System.out.println("The prefix is not present");
		}



		System.out.println(day.startsWith("Today"));
		
		boolean stringPresent = day.endsWith("Strings");
		System.out.println(stringPresent); //True

		char ret = transaction.charAt(0);
		System.out.println(ret);

		System.out.println(transaction.indexOf('5'));
		String email = "Hello123@gmail.com";
		System.out.println(email.indexOf('@'));
	}

	}
