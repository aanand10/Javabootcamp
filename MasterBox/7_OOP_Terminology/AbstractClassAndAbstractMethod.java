//& Abstract class & methods :
//* Abstract keyword is used to create abstract class and abstract methods.
//Abstract class :
//~ must have one or more abstract methods
//~ should declared by abstract keyword
//~ Instance / object of abstract class can not be declared but reference can be created.

//this is an abstract class
abstract class AbstractClass {

  //Abstract method
  abstract void AbstractMethod();

  //normal method
  void NormalMethod() {
    System.out.println("This is a normal method.");
  }
}

class ClassTwo extends AbstractClass {

  // we must have to implement the abstract method in child classes.
  @Override
  void AbstractMethod() { // abstract method body is declared after implementin g
    System.out.println("Abstract method got implemented in parent class.");
  }
}

public class AbstractClassAndAbstractMethod {

  public static void main(String[] args) {
    // AbstractClass ao = new AbstractClass(); not possible to create the instance of the abstract class.
    AbstractClass ao = new ClassTwo();
    ao.AbstractMethod();
  }
}
//read more about abstract method and abstract class at hand written notes OOP_Termininolgy.pdf > page No.: 11
