package constuctor;

public class overloading_this {
	 String finame;
	 String miname; 
	 public static void main(String[] args) {
	  overloading_this stdn2 = new overloading_this("Mary", "Elizabeth");
	 }
	 
	 //Constructor with one argument.
	 public overloading_this(String fname){ 
	  finame = fname;  
	  System.out.println("1. First Name Is "+finame);
	 }
	 
	 //Overloaded Constructor with two arguments.
	 public overloading_this(String fname, String mname){
	  this("Jim"); //1st constructor Is called using this keyword.
	  finame = fname;
	  miname = mname;
	  System.out.println("2. First Name Is "+finame);
	  System.out.println("2. Middle Name Is "+miname);  
	 } 
	}
