import java.util.HashMap;


class Main {
  public static void main(String[] args) {
    
    HashMap<String, String> cars = new HashMap<String, String>(); // create HashMap
    
    cars.put("Audi", "A4"); // adding element to our HashMap note that we use 'put' in HashMap
    cars.put("BMW", "E91");
    cars.put("VW", "Passat");
    
    System.out.println(cars);
    cars.remove("Audi");// remove elelment with Key 'Audi'
    System.out.println(cars);
    
    System.out.println(cars.get("BMW")); // get Element by Key
    
    //like ArrayList we have 'clear()' and 'size()'
    
    //Loop trough HashMap
    System.out.println("print keys");
    for(String carBrand : cars.keySet()){ // loop trough Keys
      System.out.println(carBrand);// print only keys
    }
    
    System.out.println("print values");
    //loop trough values
    for(String carModel : cars.values()){ // loop trough values
      System.out.println(carModel);
    }
    
    System.out.println("print keys and values");
    for(String car : cars.keySet()){
      System.out.println("Key " + car + " value " + cars.get(car));
    }
  }
}