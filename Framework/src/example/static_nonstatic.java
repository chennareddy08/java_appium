package example;

public class static_nonstatic {
 
 static int wheel = 2;
 int price = 25000;
 public static void main(String[] args) { //static method.
  //Can access static methods directly Inside static method.
  byke1();
  
  //Can access static variables directly Inside static method.
  System.out.println("Main static method : wheels = "+wheel);
  
  //Can not access non static variables directly inside static method.
  //System.out.println("Main static method : wheels = "+price);
  
  //Can not access non static methods directly inside static method.
  //byke2(); 
  
  //Created object of class to access non static stuff Inside static method.
  static_nonstatic sn = new static_nonstatic(); 
  
  //Now We can access non static methods of class Inside static methods using object reference.
  sn.byke2();
  
  //Now We can access non static variables of class Inside static methods using object reference.
  System.out.println("Main static method : price = "+sn.price); 

 }
 
 public static void byke1(){ //static method.
  //Can access static variables directly Inside static method.
  System.out.println("byke1 static method : wheels = "+wheel);
  
  //Can not access non static variables directly inside static method.
  //System.out.println(price);
  
 }
 
 public void byke2(){ //non static method.
  //Can access static variable directly inside non static method.
  System.out.println("byke2 Non static method : wheels = "+wheel);
  
  //Can access non static variable directly inside non static method.
  System.out.println("byke2 Non static method : price = "+price); 
  
  //Can access static methods directly Inside non static method.
  byke1();
 }
}