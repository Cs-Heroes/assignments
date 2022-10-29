package heshset;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.TreeSet;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
public class Main {

  
    public static void main(String[] args) {
       HashSet<Integer> set= new HashSet();
       set.add(8);
       set.add(9);
       set.add(78);
       set.isEmpty();
       System.out.println("set object" +set);
       PriorityQueue<Integer> pq= new PriorityQueue();
       pq.add(67);
       pq.add(89);
       pq.add(9);
       System.out.println("pq object" +pq); 
       HashMap<Integer,Integer> hm= new HashMap();
       hm.put(78,56);
       hm.put(7, 78);
       System.out.println("heshmap" +hm);
       ArrayList<Integer> A = new ArrayList();
       A.add(78);
       A.add(90);
       A.add(98);
       A.remove(1);
       A.remove(0);
       System.out.println("Array list value =" +A);
       ArrayDeque<Integer> D= new ArrayDeque();
       D.add(67);
       D.add(90);
       D.add(45);
       D.remove(90);
        System.out.println("Array Deque value"+D);
       TreeSet<Integer> T=new TreeSet();
       T.add(67);
       T.add(56);
       T.add(23);
       T.remove(23);
        System.out.println("Map  value is ="+T);
        TreeMap<Integer,Integer> P = new TreeMap();
        P.put(1, 56);
        P.put(2, 89);
        P.put(3, 34);
          System.out.println("Tree Map value is ="+P);
          LinkedHashMap<Integer,String> L= new LinkedHashMap();
          L.put(100,"Ali");
          L.put(101, "Ahmad");
          L.put(102, "Khan");
          L.remove(100);
          System.out.println("Linked Hesh Map value is ="+L);
          LinkedHashSet<Integer> K= new LinkedHashSet();
                  K.add(78);
                  K.add(67);
                  K.add(56);
                  K.remove(56);
                  System.out.println("Linked Hesh set value is ="+K);
                  
          
          
       
    }

}
