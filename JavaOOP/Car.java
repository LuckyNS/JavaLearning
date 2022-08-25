// Creating a Class for cars
public class Car {
  
  // Attributes of Class
  String model = "";
  String color = "";
  int productionYear;
  //if you dont want to override variable make it 'final'
  final byte id = 1;
  
  //Creating a method
  public void fullSpec(){
    System.out.println("My car is a " + model + " and it's a " + color + " color " + productionYear + " year");
  }
  
  public void maxSpeed(int speed){
    System.out.println("Max speed is : " + speed);
  }
}