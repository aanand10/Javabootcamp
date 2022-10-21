//& Aggregation : aggregation represents HAS-A relationship, which means when a class contains reference to another class known to have aggregation.
//~ It refers one way relationship between two objects.
//~ Aggregation refers one way relationship between two objects.
//~ Aggregation is based on usage rather than inheritance. Class A HAS-A relationship with class B if class A has a reference to an instance of class B.
// This Address class will work as structure from every students address
class Address {

  int id;
  String city;
  String state;

  Address(int id, String city, String state) { // we can say while creating object of an address class we have to pass these three parameters from that constructor and those will get stored in variables.
    this.city = city;
    this.state = state;
    this.id = id;
  }
}

public class Aggregation {

  String studentName;
  Address a; // created an reference of class Address

  Aggregation(String name, Address a) { // we have to pass an object of class Address at place of "Address a" ;
    studentName = name;
    this.a = a;
  }

  void show() {
    System.out.println("Student name :" + studentName);
    System.out.println("Id is :" + a.id);
    System.out.println("City name : " + a.city);
    System.out.println("State name : " + a.state);
  }

  public static void main(String[] args) {
    //Let's first create an object of Address class because later we have to use that object
    //Student 1: Anand
    System.out.println("~ Student 1 :");
    Address ao = new Address(10, "Nashik", "Maharashtra");
    //Let's create object of Aggregation class to call the show method
    Aggregation agrObj = new Aggregation("Anand", ao); // here we have passed a object as a parameter
    agrObj.show();
    //Student 2: Ram
    System.out.println("~ Student 2 :");

    ao = new Address(11, "Malegaon", "Maharashtra "); // assigning diff value using same reference
    agrObj = new Aggregation("Ram", ao); // ram details are passed
    agrObj.show(); // this will print ram details
    //! As we seen we don't have to repeatedly recreate whole class we just change the info rather than recreating whole structure.
  }
}
