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
    //# for instance/ object creation we call constructor [singleton obj = new singleton();] ; but here the default constructor is private so we have call the public method which we have derived in the class, which returns an instance/ object of the class.
    //# If we are trying to create more reference variable , it is possible to create more reference variable as of they are pointing to the same object.
    singleton newObj = singleton.getInstnace();
    //# Here obj and newObj are pointing top the same object which is returned by the getInstance() method.
    //!Note : singleton obj = new singleton(); here obj is an reference variable which will point to the created object as object is created we call it as object name.
  }
}
