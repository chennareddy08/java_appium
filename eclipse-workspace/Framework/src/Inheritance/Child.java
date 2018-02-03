package Inheritance;

public class Child extends Parents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //you want to inheritance properties and method of parent class we need create object of child class
		Child ch =new Child();
		ch.city();
		ch.state();
		System.out.println(ch.pin);

	}
 public void work() {
	 System.out.println("working in home");
 }
}
