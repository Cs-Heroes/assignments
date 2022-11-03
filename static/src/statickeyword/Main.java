

package statickeyword;
//Example of static variable
/**
 *
 * @author Hedayatullah Nikzad
 */
public class Main {

    public static void main(String[] args) {
         Student8 s1 = new Student8(111,"Karan");  
 Student8 s2 = new Student8(222,"Aryan");  
   
 s1.display();  
 s2.display();
 Student9.change();  
  
    Student9 s3 = new Student9 (111,"Karan");  
    Student9 s4 = new Student9 (222,"Aryan");  
    Student9 s5 = new Student9 (333,"Sonoo");  
  
    s3.display();  
    s4.display();  
    s5.display();  
     
 
    }

}
class Student8{  
   int rollno;  
   String name;  
   static String college ="ITS";  
     
   Student8(int r,String n){  
   rollno = r;  
   name = n;  
   }  
 void display (){System.out.println(rollno+" "+name+" "+college);}  }
//Example of static method
    
class Student9{  
     int rollno;  
     String name;  
     static String college = "ITS";  
       
     static void change(){  
     college = "BBDIT";  
     }  
  
     Student9(int r, String n){  
     rollno = r;  
     name = n;  
     }  
  
     void display (){System.out.println(rollno+" "+name+" "+college);}  
  
   
    
}
  


