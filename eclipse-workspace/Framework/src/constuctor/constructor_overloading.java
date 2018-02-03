package constuctor;

public class constructor_overloading {
	 String finame;//Instance variable
	 String miname;//Instance Variable 
	 public static void main(String[] args) {
	  constructor_overloading stdn1 = new constructor_overloading("Jim");
	  constructor_overloading stdn2 = new constructor_overloading("Mary", "Elizabeth");
	 }
	 
	 //Constructor with one argument.
	 public constructor_overloading(String fname){ 
	  finame = fname;//Local Variable  
	  System.out.println("1. First Name Is "+finame);
	 }
	 
	 //Overloaded Constructor with two arguments.
	 public constructor_overloading(String fname, String mname){
	  finame = fname;
	  miname = mname;
	  System.out.println("2. First Name Is "+finame);
	  System.out.println("2. Middle Name Is "+miname);  
	 } 
	}
