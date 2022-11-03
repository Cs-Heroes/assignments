package aggregation;

/**
 *
 * @author Hedayatullah Nikzad
 */
class Operation{  
 int square(int n){  
  return n*n;  
 }  
}  
  
class Circle{  
 Operation op;//aggregation  
 double pi=3.14;  
    
 double area(int radius){  
   op=new Operation();  
   int rsquare=op.square(radius);  
   return pi*rsquare;  
 }  
}
 
public class Main {

    public static void main(String[] args) {
         Circle c=new Circle();  
   double result=c.area(5);  
   System.out.println(result);  
   
// wrraper classes
//Converting int into Integer  
int a=20;  
Integer i=Integer.valueOf(a);//converting int into Integer  
Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally  
  
System.out.println(a+" "+i+" "+j);  
 
  
       
    }
    

}
