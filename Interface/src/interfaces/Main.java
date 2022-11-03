
package interfaces;

/**
 *
 * @author Hedayatullah Nikzad
 */
// simle example interface
//Simple example of encapsulation in java

interface Printable{  
void print();  
}  
interface Showable{  
void print();  
}  
  
class TestTnterface1 implements Printable,Showable{  
public void print(){System.out.println("Hello");}  
 
}  
public class Main {

    public static void main(String[] args) {
     TestTnterface1 obj = new TestTnterface1();  
obj.print(); 
    }

}
