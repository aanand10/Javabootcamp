//! Let's see little bit about Static or in my words lets see about static family (variable , method and class) :
//~ Static family get called as class loads.
//~ We can call static members by their name there is no need of calling them by the reference or we can say there is no need of object to call them.
//~ Anything that is static is part of class not of the object.
//^ The main method "public static void main...." is also static because it is very first thing that JVM calls. SO it must be :
//                              ~ it should get loaded as class loads
//                              ~ accessed from every where in the class ,
//                              ~ it should be get accessed directly.
//~ Static variable is same for the whole class.

//~ Static method :
//~ In static method we directly can't access the non static data, in short we can't access the non static members by direct their name, although we can access them by the object/ instance reference.

public class StaticFamily {

  //& Static data :
  static float version = 1.1f;

  static void staticMe() {
    System.out.println(
      "Hello! I'm Static method which is being called directly by its name."
    );
  }

  //& Non-static data :
  String fileName = "StaticFamily.java";

  void nonStaticMe() {
    System.out.println(
      "I'm a non static method, I can't get directly called by my name I need an object to call."
    );
  }

  public static void main(String[] args) {
    StaticFamily SFobject = new StaticFamily(); //Object creation

    System.out.println("Welcome to Static Family Code file.");
    //& Calling Static data :
    System.out.println("~ The version of the file is " + version); // as version is static member it is possible to call by its name. It will go same with the method.
    staticMe();
    //& Calling Non-Static data :
    System.out.println(
      "~ We can't access non-static members by their name 'fileName and staticMe' but we can call them by reference of the class.\n" +
      "~ File name of class file is " +
      SFobject.fileName
    );
    SFobject.nonStaticMe();
    System.out.println(SFobject.getClass());
  }
}
