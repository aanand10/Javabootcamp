//! Before starting nested java class we will see little bit about singleton class
//~ Singleton class :  a class whose only one instance can be created. More than one instance creation for that class is not allowed.
//! Class object is also called as class instance.

class singleton {

  static singleton object = new singleton(); // static object is created. we kept it static due to that we can access it directly.

  private singleton() { // We are making default constructor private due to that another instance/ object of the class should not get created
    System.out.println("I'm a private constructor.");
  }

  public static singleton getInstnace() { // Creating a public method which will return an instance/ object which is created above. This will allow to create only one object of the class.
    return object; // for directly calling here we have kept object static
  }
}

public class NestedClass {

  public static void main(String[] args) {
    // singleton obj = new singleton();  we can't create object directly because default constructor is private. So we have to create it by accessing the method which we have created. Because that method returns an object.
    singleton obj = singleton.getInstnace();
    singleton obj1 = singleton.getInstnace();
  }
}
