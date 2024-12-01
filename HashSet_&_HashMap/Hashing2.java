import java.util.*;

public class Hashing2 {
  public static void main(String[] args){
    HashMap<String, Integer> map = new HashMap<>();

    //Insertion
    map.put("India", 120);
    map.put("US", 30);
    map.put("Chaina", 150);

    System.out.println(map);

    //Update valuse
    map.put("Chaina", 180);
    System.out.println(map);

    //Lookup(Search)
    if(map.containsKey("Chaina")){
      System.out.println("Key is present in the map..");
    }
    else {
      System.out.println("Key is not present map.");
    }

    System.out.println(map.get("Chaina")); //key exists
    System.out.println(map.get("America")); //key dose not exist.

    //Iteration in HashMap..
    for(Map.Entry<String, Integer> e : map.entrySet()){
      System.out.print(e.getKey() +" ");
      System.out.print(e.getValue() + ",");
    }

    // get only key
    Set<String> keys = map.keySet();
    for(String key : keys){
      System.out.println(key+ " " + map.get(key));
    }

    // remove pair 
    map.remove("Chaina");
    System.out.println(map);
  }
}
