package example;

public class vehicle { 
	 public static void main(String[] args) {
	  //Created object for vehicle class using new keyword.
	  //bicycle is the reference variable of this object.
	  vehicle bicycle = new vehicle("Black");
	  
	 } 
	 //Constructor with color parameter passed. It will retrieve value from object vehicle. 
	 public vehicle(String color){
	  //Retrieved value will be printed.
	  System.out.println("Color Of vehicle Is "+color);  
	 } 
	}