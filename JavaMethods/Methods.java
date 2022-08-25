//Methods
class Methods {
  //create a method
  static void myFirstMethod(){
    System.out.println("This is my first created method");
  }
    
  //Create a method with Parameters and arguments
  static void method2(String firstName, int age){ // You can call method with one or more parameters
    System.out.println("Your first name is : " + firstName + " you are " + age + " years old");    
  }
  
  //Create method which return value
  static int sum(int a, int b){ //note that there is no 'void' when you return value
    return a + b;
  }
  // Create same method but with 'double' type  
  static double sum(double a, double b){ 
    return a + b;
  }
  
  //Method with if statement inside 
  static void checkAge (int age){
    if (age < 18) {
      System.out.println("Acces denied");
    } else {
      System.out.println("Acces granted");
    }
  }
  
  
  
  public static void main(String[] args) {
    //Call myFirstMethod
    myFirstMethod();
    
    //Call method2 with arguments
    method2("Niki", 35);//method call must have the same number of arguments as there are parameters, and the arguments must be passed in the same order
    
    //Call sum method
    int result = sum(2, 5);
    System.out.println("The sum is : " + result);
    
    //Overload sum method
    double result2 = sum(2.5, 2.8);
    System.out.println("Sum with using double : " + result2); // overloading sum method using same name with different type
    
    
    //Call chekAge method
    checkAge(35);
    
  }
}