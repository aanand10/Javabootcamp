//! Part 1 :
//~ Object oriented Programming : this helps to program or code real world problems efficiently. This is used to break complex problems into simpler and smaller objects.
//~ Classes , Objects and methods
//~ Classes : These are the blueprint for the other objects.
//~ Object : These are created by the classes.
//~ Method : Objects use methods to communicate between them or we can say methods are the block of code which are used to perform specific task.

//* Let's take a real world example. Consider a case of the car.
// Assume "Car" as a Class and the name of the car "fordAspire" as an object of car class and the activities or actions done by the car are the methods link for starting "start()" method can be used and the values we pass through the method are called as parameters. Which we will see further.
// In short  : Class = Car
//             Object = fordAspire
//             Method = start()
class Car {

  String color = "White"; // variable or we can say it is an element of class
  int price = 10; // variable

  public void start() { // Method
    System.out.println("Car is Starting.");
  }

  //! Constructor : This is type of method which have same name as the class name and don't have any return type.
  // For more info please check the handwritten notes.
  Car() {
    System.out.println(
      "Hello from a non- parameterized / default constructor. This line is showing because the object is created using this Non-parameterized constructor or constructor is called."
    );
  } // this is a default constructor.

  Car(int price) { // this is a parameterized constructor.
    this.price = price;
    System.out.println(
      "Hello from a parameterized constructor. This line is showing because the object is created using this parameterized constructor or constructor is called."
    ); // This line will print when object will get created.
  }
}

public class OOP {

  public static void main(String[] args) {
    //For calling or using anything from another class we need to create its object firstly which will work as an reference to that class. By using that object we are able to access stuff from that class.
    // Creating an object :
    // ClassName objectName = new ClassName(); // object is created
    Car fordAspire = new Car(); // Here fordAspire object is created and non parameterised constructor is used here.
    Car ecoSport = new Car(12); // Here ecoSport object is created and parameterised constructor is used here, so we have passed value through the method.
    //Now using the object we will access the elements of that class
    System.out.println(fordAspire.color); // this will access or show us a color element of the car class.
    fordAspire.start(); // by using object we calling the start method from the class.
    new Car(); // constructor can be called by using this syntax
  }
}
