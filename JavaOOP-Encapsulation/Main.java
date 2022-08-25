class Main {
  public static void main(String[] args) {
    
    Student firstStudent = new Student(); // Create new student
    
    firstStudent.setName("Nikolay");
    firstStudent.setAge(35);
    
    
    System.out.println(firstStudent.getName());
    System.out.println(firstStudent.getAge());
  }
}