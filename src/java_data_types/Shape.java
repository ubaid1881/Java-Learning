package java_data_types;

public abstract class Shape {

	public Shape() {
		System.out.println("A Shape has been created");
	}
	
	public int RectangleArea(int length, int width) {
		
		return(length*width);
	}
	
   public int SquareArea(int width) {
		
		return(width*2);
   }
   
   }
   
	
