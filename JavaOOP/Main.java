
class Main {
  public static void main(String[] args) {
    
    Car myCar = new Car(); //Creating a new object mycar
    myCar.model = "BMW"; //adding a model to mycar
    myCar.color = "Black"; //adding a color of myCar
    myCar.productionYear = 2006;
    
    myCar.fullSpec(); //calling Class method
    myCar.maxSpeed(250);
    
  }
}