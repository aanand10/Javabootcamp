//& Super keyword : this keyword is used in subclasses to access members of the super class.
//& it is also used to access overridden methods of the super class.
//! Super keyword can't be used in static content.

//& Final keyword :In Java, the final keyword is used to denote constants. It can be used with variables, methods, and classes.
//~ Once any entity (variable, method or class) is declared final, it can be assigned only once.
//^ Final variable : the final variable cannot be reinitialized with another value.
//^ Final Method:  the final method cannot be overridden.
//^Final class:  the final class cannot be extended.
class SuperClass {

  public String Name = "My Name is Super class";

  public void show() {
    System.out.println(Name);
  }

  //! final
  final double pie = 3.142; // we can use it as constant

  public final void finalMethod() {
    System.out.println(
      "This is an final method it can't be overridden but it can be overloaded."
    );
  }

  // final method overloading
  public final void finalMethod(String name) {
    System.out.println("final method overloaded method.");
  }
}

final class FinalClass {

  String name = "Final class";
}

// class Subclass extends FinalClass {}   this is not possible because final class can't be inherited

public class SuperAndFinalKeyword extends SuperClass {

  public String Name = "My Name is Child class";
  public String oldName = super.Name; // will refer to the super class Name variable rather than child class Name variable

  public void show() {
    System.out.println(Name);
    super.show(); //Accessing the overridden method. this is calling show method of super class
  }

  public static void main(String[] args) {
    SuperAndFinalKeyword so = new SuperAndFinalKeyword();
    so.show();
  }
}
