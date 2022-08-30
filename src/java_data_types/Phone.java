package java_data_types;

 class Phone1 {
	 String make ="Apple";
	 String color = "Black";
	 
	 
 }
	
 class smartPhone extends Phone1 {
	 String make = "Samsung";
	 String color = "Yellow";
	 
	 
	 void displayChildMake() {
		 System.out.println("The phone is " + make);
		 System.out.println("The color is " + color);
	 }
	 
	 void displayParentMembers() {
		 
		 System.out.println("This will print parent members : " + super.make);
		 System.out.println("This will print the color " + super.color);
	 }
	 
 }
 
 
 public class Phone {
	public static void main(String[] args) {
		smartPhone a = new smartPhone();
		a.displayChildMake();
		a.displayParentMembers();

	}

}
