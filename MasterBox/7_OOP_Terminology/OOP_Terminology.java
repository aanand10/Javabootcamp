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

//& Let's see some access related stuff which happens in inheritance :
//^  Things in Parent class  |   Can accessed by child class ?     | Can accessed by child of child class ?  |
//---------------------------|-------------------------------------|-----------------------------------------|
//        private            |             no                      |              no                         |
//        protected          |             yes                     |             yes                         |
//        default            |             yes                     |             yes                         |
//        public             |             yes                     |             yes                         |
//---------------------------|-------------------------------------|-----------------------------------------|

class Vehicle {

  String name = "I'm the parent class";
  private float betaVersion = 1.3f;
  protected static float version = 1.2f;

  void namasteFromVehicle() {
    System.out.println(name);
  }
}

//! Single Inheritance
class Car extends Vehicle {

  //! float betaVersion = Vehicle.betaVersion; // this can't be assigned because betaVersion is private which can be only accessible from the Vehicle class.
  float version = Vehicle.version; // this can be assigned because version is protected which can be accessible from the child classes of vehicle class.

  Car() { // default constructor of the class
    System.out.println("Heyy, I'm the default constructor of the Car class");
  }

  String name = "I'm the child class of the vehicle class.";

  void namasteFromCar() {
    System.out.println(name);
  }
}

class Airplane extends Vehicle {

  String name = "I'm the child class of the vehicle class.";

  void namasteFromAirplane() {
    System.out.println(name);
  }
}

//! Multiple inheritance
class EVCar extends Car {

  float version = Vehicle.version;
  String name =
    "My class name is EVCar. I'm the child class of the Car class who is child of Vehicle";

  void namasteFromEVCar() {
    System.out.println(name);
  }
}

//!  Hierarchical inheritance :
//                       Vehicle
//                       ↗    ↖
//                     Car    Airplane
//                   ↗  ↑  ↖
//              EVCar  PCar DCar
class PetrolCar extends Car {

  String name =
    "My class name is PetrolCar. I'm the child class of the Car class who is child of Vehicle";

  void namasteFromPetrolCar() {
    System.out.println(name);
  }
}

class DieselCar extends Car {

  DieselCar() {
    super();
    System.out.println("I'm the constructor of the DiselCar class.");
  }

  String name =
    "My class name is DieselCar. I'm the child class of the Car class who is child of Vehicle";

  void namasteFromDieselCar() {
    System.out.println(name);
  }

  //! Using super keyword we will access the method from parent class here parent class of the DieselCar is Car. SO here super keyword will refer things in the parent class

  void usingSuper() {
    System.out.println(
      "~ This is being printed using super keyword. we are going to access the default constructor and some elements using super keyword. \n* We can access elements of parent class by using super keyword super.name will give :" +
      super.name
    );
  }
}

// class HybridCar extends PetrolCar , DieselCar {}      //this is not possible in java in the case of multiple inheritance using the classes.

public class OOP_Terminology {

  public static void main(String[] args) {
    //If we create the object of the super class here that is "Vehicle". Using that object we can only access elements of that class, we can't access anything from its child classes.
    Vehicle vo = new Vehicle();
    vo.namasteFromVehicle();
    // If we create the object of the child class then we can access the properties from other upper classes because child class have been inherited properties of the parent class
    DieselCar co = new DieselCar();
    co.namasteFromDieselCar();
    co.usingSuper();
  }
}
