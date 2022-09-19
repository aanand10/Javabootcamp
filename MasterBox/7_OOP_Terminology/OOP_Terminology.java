//! Object Oriented Programing :
// Pillars of the OOP are inheritance, encapsulation, polymorphism and abstraction.
//Let's start with inheritance
//^ Inheritance :
//~ Inherit word meaning is taking or absorbing properties from someone (parent class/ super class). It can be shown as
//~                       Parent
//~                          ↑
//~                       Child
//~ Real life example : we all are the example of inheritance because we are inherited gens from aur parents and the have inherited from their parents.
//~ Deriving new class from the super class. Like for creating smartphone we don't need to make it from start we can just create smartphone class from phone class then it we will add other required properties to  that class.
//~ As child class inherits properties from parent class (super class), here child class can access everything from the parent class but child can't access anything from the child class.

//& Super keyword :
//*                  this is used to refer parent class.
//*                  super() method is used to call the constructor of the super class.
//! Note : We can't use super keyword in static methods.

//& Types of inheritance :
//^ 1. Single inheritance
//                       A
//                       ↑
//                       B
//^ 2. Multi level inheritance
//                       A
//                       ↑
//                       B
//                       ↑
//                       C
//^ 3. Multiple inheritance : this is not supported in java because it can cause naming ambiguity. But it can be done using interfaces which we are going to see further.
//                  A     B
//                   ↖ ↗
//                    C
//^ 4.Hierarchial inheritance :
//                         A
//                       ↗  ↖
//                     B     C
//                   ↗  ↖
//                  D    E
//^ 5. Hybrid inheritance : Multiple + Hierarchial. this is also not supported in java
//                         A
//                       ↗  ↖
//                      B    C
//                       ↖ ↗
//                        C

class Vehicle {

  String name = "I'm the parent class";

  void namasteFromVehicle() {
    System.out.println(name);
  }
}

//! Single Inheritance
class Car extends Vehicle {

  String name = "I'm the child class of the vehicle class.";

  void namasteFromCar() {
    System.out.println(name);
  }
}

//! Multiple inheritance
class EV extends Car {

  String name = "I'm the child class of the Car class who is child of Vehicle";

  void namasteFromEV() {
    System.out.println(name);
  }
}

//! Hierarchical inheritance :

class PetrolCar extends Car {

  String name = "I'm the child class of the Car class who is child of Vehicle";

  void namasteFromEV() {
    System.out.println(name);
  }
}

public class OOP_Terminology {

  public static void main(String[] args) {}
}
