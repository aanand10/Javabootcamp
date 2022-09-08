package NestedClass;

//************* Inner class or non-static nested class *************
// In java we can define a class within another class such classes are known as nested / inner class.
// Elements in the inner class and elements are can be accessed by dot "." operator.
// class files will be created as :
// OuterClass.java
// OuterClass$InnerClass.java

class OuterClass {

  // inner class
  class InnerClass {

    int a = 10;

    // local inner class
    void LocalInnerClass() {
      class a {

        String name = "inner method array";
      }
    }
  }
}

public class NestedClass {

  public static void main(String[] args) {
    OuterClass obj = new OuterClass(); //Outer class obj created
    OuterClass.InnerClass obj1 = obj.new InnerClass(); // inner class object created

    OuterClass.InnerClass obj2 = new OuterClass().new InnerClass(); // we can simultaneously create objects of the both the classes.
    System.out.println(obj1.a);
  }
}
