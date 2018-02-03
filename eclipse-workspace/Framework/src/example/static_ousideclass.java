package example;

public class static_ousideclass {

 public static void main(String[] args) { //static method.
  
  //Can call static function from other class directly using class name.
  static_nonstatic.byke1();
  
  //Can call static variables from other class directly using class name.
  System.out.println("Using static variable of other class"+static_nonstatic.wheel);
  
  //Created object of class static_nonstatic to access non static stuff from that class.
  static_nonstatic oc = new static_nonstatic(); 
  
  //Now We can access non static variables of other class Inside static methods using object reference.
  System.out.println("Accessing non static variable outside the class : "+oc.price);
  
  //Now We can access non static methods of other class Inside static methods using object reference.
  oc.byke2();

 }

}