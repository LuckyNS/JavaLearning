import java.util.HashSet;


class Main {
  public static void main(String[] args) {
    
    HashSet<String> cars = new HashSet<String>();
    cars.add("BMW");
    cars.add("Audi");
    cars.add("VW");
    cars.add("BMW"); // note that we add 'BMW' again
    
    System.out.println(cars); // note that there is only one 'BMW' bcs element in hashset are unique
    
    //Check if element contains in Hashset
  	System.out.println(cars.contains("Audi"));
    
    //clear(), size(), remove()
    
    HashSet<Integer> num = new HashSet<Integer>();
    num.add(1);
    num.add(3);
    num.add(4);
    
    for(int i = 0; i < 5; i++){
      if(num.contains(i)){
        System.out.println(i + " is in HashSet");
      }else{
        System.out.println("There is no " + i + " in HashSet");
      }      
    }
  }  
}