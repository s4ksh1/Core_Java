// Object is an instance of class
class Student
{
  int rollno;      // instance variable
  String name;     // instance variable
  static String uni_name;  // static variable; common for all the objects
  Student(int r , String n, String un) // constructor; used to intialize the variables
  {
    this.rollno = r;   // this is used to refer to ewly created object
    this.name = n;
    this.uni_name =un;
    }
}
class Main
{
  public static void main(String[] args)    // main method
  {
    Student s1 = new Student(123, "sakshi","UPES");   // object creation
    Student s2 = new Student(456, "sakshia","UPES");
    System.out.println(s1.rollno);  // printing instance variables using objects
    System.out.println(s2.rollno); 
    System.out.println(s1.name);
    System.out.println(Student.uni_name);   // printing static variable using class name 
  }
}

Output:
javac Main.java
java Main 
123
456
sakshi
UPES
