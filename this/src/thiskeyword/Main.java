package thiskeyword;

/**
 *
 * @author Hedayatullah Nikzad
 */
//exaple the this keyword
//example for inhiretanc
class Employee{  
 float salary=40000;  
}  
class Programmer extends Employee{  
 int bonus=10000;  
  
  
 //**********************************************
} 
class Student11{  
    int id;  
    String name;  
      
    Student11(int id,String name){  
    this.id = id;  
    this.name = name;  
    }  
    void display(){System.out.println(id+" "+name);}  
    
    
}
public class Main {
    public static void main(String[] args) {
        Student11 s1 = new Student11(111,"Karan");  
    Student11 s2 = new Student11(222,"Aryan");  
    s1.display();  
    s2.display();  
     Programmer p=new Programmer();  
   System.out.println("Programmer salary is:"+p.salary);  
   System.out.println("Bonus of Programmer is:"+p.bonus);  
  
    }

}
