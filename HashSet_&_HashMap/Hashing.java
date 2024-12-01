import java.util.HashSet;
import java.util.Iterator;

public class Hashing{
  public static void main(String S[]){
    HashSet<Integer>set = new HashSet<>();

    //Insert
    set.add(1);
    set.add(1);
    set.add(2);
    set.add(3);

    //Print all element 
    System.out.println(set);

    //Serach - contains
    if(set.contains(1)){
      System.out.println("set contains 1");
    }
    if(!set.contains(6)){
      System.out.println("does not contains");
    }
    //Delete
    set.remove(1);
    if(!set.contains(1)){
      System.out.println("does not contain 1 - we delete 1");

    //Size
    System.out.println("Size of set is : " + set.size());

    //Iterator - traversal set elements
    Iterator it = set.iterator();
    
    //hasNext(); next();
    while(it.hasNext()){
        System.out.println(it.next());
      }
    }
  }
}