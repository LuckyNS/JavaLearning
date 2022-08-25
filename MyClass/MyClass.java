class Main {
  public static void main(String[] args) {
    
    //types in java
    final int id = 1; //constant cant be modified 
    String name = "niki"; // String starts with Capital letter because is non-primitive type
    char letter = 'x'; // char must be surounded with single quote '' 
    int age = 35; // int is a primitive type so starts with lower letter 
    System.out.print("# " + id);
    System.out.println(" Hello " + name);
    System.out.println(age + " years old");
    
    /*example of for cycle and if statment and multiline comment
    break*/
    for(int i = 0; i < 5; i++){
      if(i == 2){ // when i = 2 the code will brake
        break;
      }
      System.out.println("Using 'break' function when reach 2 stop program");
      System.out.println(i);
    }
    
    //continue
    for(int i = 0; i < 5; i++){
      if(i == 2){ // when i = 2 the program will continue
        continue;
      }
      System.out.println("Using 'continue' function when reach 2 will pass and continue");
      System.out.println(i);
    }
    
    //Arrays
    
	 //for each
    String[] cars = {"bmw", "audi"}; // Array can contain multiple values in single variable
    
    System.out.println("Loop through array using 'foreach'");
    for (String car : cars) {
      System.out.println(car);
    }
    
    //for 
    System.out.println("Loop through array using 'for'");
    for (int i = 0; i < cars.length; i++){
      System.out.println(cars[i]);
    }

	int[] myNum = {10, 20, 30, 40}; // Array of integers
    System.out.println("myNum array : ");
    for (int num : myNum){
      System.out.println(num);
    }
    
	System.out.println("First element of array is : " + myNum[0]); // Accesing the 1st element of array
    
    myNum[1] = 25; // Changing the value of 2nd element of array
    
    System.out.println("changed value of 2nd element");
    
    for (int num : myNum){
      System.out.println(num);
    }
    
    System.out.println("The length of myNum is : " + myNum.length); //find length of array 
    
    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };// multidimensional array
    
    System.out.println(myNumbers[0][1]);// print 2nd element of 1st array

  }
}