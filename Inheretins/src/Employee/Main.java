

package Employee;
class Employee{
    float salary=40000;
}
class programmar extends Employee{
    int bonus=10000;  
}
public class Main {


    public static void main(String[] args) {
     programmar p=new programmar();
     System.out.println("programmer salary is =  "+p.salary);
     System.out.println("Bonus salary is = "+p.bonus);
      
    }
    

}
