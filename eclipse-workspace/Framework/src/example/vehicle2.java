package example;

public class vehicle2 { 
	 
	 public static void main(String[] args) {
	                //Create 2 objects of class. Both have different reference variables.
	  vehicle2 bicycle = new vehicle2("black", 2, 4500, 3.7);
	  vehicle2 motorcycle = new vehicle2("Blue", 2, 67000, 74.6);

	 }
	 
	 public vehicle2(String color, int wheels, int price, double speed){
	  System.out.println("Color = "+color+", Wheels = "+wheels+", Price = "+price+", Speed = "+speed);
	 } 
	}