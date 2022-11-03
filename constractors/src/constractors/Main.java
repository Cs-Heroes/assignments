
package constractors;
//default constractor
class Bike1{
    Bike1(){System.out.println("Bike is Greated");}                                                                                                                                                                                                                                                                                                                                             
}
public class Main {

    public static void main(String[] args) {
        Bike1 b=new Bike1();
        Student3 s1=new Student3();  
Student3 s2=new Student3();  
s1.display();  
s2.display();  
   Student4 s3 = new Student4(111,"Karan");  
    Student4 s4 = new Student4(222,"Aryan");  
    s3.display();  
    s4.display();  
    Student5 s6 = new Student5(111,"Karan");  
    Student5 s7 = new Student5(222,"Aryan",25);  
    s6.display();  
    s7.display();  
    
    
       // Example of default constructor that displays the default values
        
       
    }

}
class Student3{  
int id;  
String name;  
  
void display(){System.out.println(id+" "+name);}}
  //Example of parameterized constructor
 class Student4{  
    int id;  
    String name;  
      
    Student4(int i,String n){  
    id = i;  
    name = n;  
    }  
    void display(){System.out.println(id+" "+name);}   
 
}
// Example of Constructor Overloading
 class Student5{  
    int id;  
    String name;  
    int age;  
    Student5(int i,String n){  
    id = i;  
    name = n;  
    }  
    Student5(int i,String n,int a){  
    id = i;  
    name = n;  
    age=a;  
    }  
    void display(){System.out.println(id+" "+name+" "+age);}  
   
    
    
}


