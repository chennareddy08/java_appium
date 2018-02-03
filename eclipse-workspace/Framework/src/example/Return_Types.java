package example;

public class Return_Types {

 static int c;
 static double d; 
 public static void main(String[] args) {
  Mul(2,3);
  Div(7,3);
  System.out.println("Value of c Is "+c);
  System.out.println("Value of d Is "+d);
  Message();
 }
 //This method is returning integer value. It's return type is int.
 public static int Mul(int a, int b){
  c=a*b;
  return c;  
 } 
 //This method is returning double value. It's return type is double.
 public static double Div(double a, double b){
  d=a/b;
  return d;  
 }
 //This method is returning nothing so there is used void return type.
 public static void Message(){
  System.out.println("Test Message");
 }
}
