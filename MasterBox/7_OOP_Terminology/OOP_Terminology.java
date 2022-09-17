//! Object Oriented Programing : Let's see what is Object Oriented Programing and what does it means ?
//~ Object Oriented Programing (OOP) means solving real world problems using lines of code along with some terminologies like abstraction , inheritance , polymorphism inheritance , aggregation, etc.
//~ OOP helps us solving real world problems more easily than procedural programing.
//~ Object is an entity which have some states and behavior. e.g.: Car is an object which have
//~ states : first gear , AC on, headlights on, etc.
//~ behavior : moving forward, moving back, braking, etc.

//~ Class : it is an blueprint for the object. e.g.:  Car is a class it is an template for all other companies to make their cars accordingly.

class Car {

  int price; // class variable or state
  String color; // class variable

  void start(int price, String color) { // class method or we can say it behavior
    this.price = price;
    this.color = color;

    System.out.println(
      "Your car price is " + price + " and color is " + color + " is starting."
    );
  }
}

public class OOP_Terminology {

  public static void main(String[] args) {
    Car co = new Car();
    co.start(700000, "Red");
  }
}
