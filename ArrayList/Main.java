import java.util.ArrayList; // import ArrayList
import java.util.Collections; // import Array Collections


class Main {
  public static void main(String[] args) {
    
    ArrayList<String> myList = new ArrayList<String>(); /* Create Array List in this case is array of string
    but can be int but must declare like Integer other types are Boolean, Character, Double .... note
    that must start with Capital letter*/
    
    myList.add("BMW");  // Adding items in myList
    myList.add("VW");
    myList.add("AUDI");
    myList.add("MERCEDES");
    
    System.out.println(myList);
    Collections.sort(myList);// Sorting Array alphabetically or numerically
    System.out.println("Sorted : "  + myList);
    myList.remove(2);  // removing 3rd element from myList
    System.out.println(myList);
    
    String bmw = myList.get(0); //Getting element from Array
    System.out.println(bmw);
    
    myList.set(0, "LADA");  // Changing value of first element in myList
    
    String lada = myList.get(0);
    System.out.println(lada);
    
    //myList.clear();  clear Array
    
    System.out.println(myList.size()); // get size-length of Array
    
    for(String car : myList){ // loop trough Array elements
      System.out.println("Brand : " + car);
    }
  }
}