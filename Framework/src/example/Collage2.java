package example;

public class Collage2 {

	private String Department = "Mechanical Engineering";
	 private String name; 
	 private double percentile;
	 public static void main(String[] args) {
	  Collage2 student1 = new Collage2("Smith");
	  student1.setPercentage(57.35);
	  student1.print_details();
	 }
	 public Collage2(String student_name){
	  name = student_name;   
	 }
	 
	 public void setPercentage(double perc){
	  percentile = perc;
	 }
	  
	 public void print_details(){ 
	  int Year = 2014;
	  System.out.println("Resultg Of Year = "+Year);
	  //Can access other class's class variable using that class name.
	  System.out.println("Student's Collage Name = "+Collage1.Collage_Name);
	  System.out.println("Student's Department = "+Department);
	  System.out.println("Student's Name = "+name);  
	  System.out.println("Student's percentile = "+percentile+"%");
	  System.out.println("**********************");   
	 }
	}
