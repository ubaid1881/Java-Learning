package java_data_types;


abstract class Jet {
	abstract void speed(); // abstract method
	abstract void size();
	abstract void generation();
	
}

abstract class capacity extends Jet {
	void speed() {
		System.out.println("This is a speed method");
	}
	void size() {
		System.out.println("This is a size method");
	}
	abstract void dimension();
}

class brand1 extends capacity {
	void dimension() {
		System.out.println("This is a dimension method");
	}
 	void generation( ) {
 		System.out.println("This is a weight method");
 	}
	
}

public class Day_20_Abstract_example {
	
		public static void main(String[] args) {
			brand1 b = new brand1();
			b.speed();
			b.dimension();
			b.generation();
			b.size();
		
		}

}
