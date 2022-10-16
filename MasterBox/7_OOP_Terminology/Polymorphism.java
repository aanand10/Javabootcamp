//& Polymorphism : the word polymorphism contains its meaning "poly" means many and "morphism" means may ways.
// The real world example of this is yourself. As you play many roles at a time because you are a student, you are brother/sister , son/daughter, etc. at the same time this show many roles/ forms of single person.
//~ This is achieved by :
//  1) Method overloading
//        Same name but data types, arguments, return types, order can be different.
//  2) Method overriding
//        Name ,  arguments, return type, order everything is same but the body of the method is different.
//  3) Operator overloading

//~ Types of polymorphism :
// 1. Compile time/static polymorphism  : achieved via method overloading.
// 2. Runtime/ Dynamic overriding : achieved via method overriding.

//Example:              Shape
//                 ↙     ↓     ↘
//            Triangle  Circle  Rectangle
//~ render() method behaves differently in different classes. Or, we can say render() is polymorphic.  Which have same name in every class but different action is done in every method.

//! If we are referencing from parent class to the method of child then the method which is being overridden should be present in superclass.

//! Fact : By default every class extends Object class.
/*  class Shape {
  void meth1(){}
  void meth2(){}
}

class Circle {
  void meth1(){}
  void meth2(){}
  void meth3(){}
}
 
Here if we try to refer shape to circle (Parent to child)
Shape obj = new Circle();
obj.meth1();   //valid
obj.meth2();   //valid
obj.meth3();   // invalid because meth3 is not present in Shape class (parent class) that must be in Shape class also.

Circle co = new Circle();
co.meth3();    //Now this is valid 
 */

//&  Types of Relationship
//    ↙             ↘
//Association     Inheritance
//HAS-A rel.        IS-A rel.

//*    Association (HAS-A relationship )
// Has two parts :
// 1. Aggregation : it shares weak bond
//

class Shape {

  // render() method
  public void render() {
    System.out.println("This a shape class.");
  }

  //& Compile time polymorphism/ static polymorphism : method overloading
  //* Here method overloading is done by creating two same named methods having different parameters
  public void shapeName(String name) {
    System.out.println("This shape name is " + name + " .");
  }

  public void shapeName(String name, int id) {
    System.out.println("This shape name is " + name + "  and it's id is " + id);
  }

  // & Runtime/ Dynamic overriding : achieved via method overriding.
  // Method which is being overridden must be available in super class
  //! Overriding only happens when inheritance is happening.

  public void NumberOfSides(int side) {
    System.out.println("~ Number of sides of this shape is  : " + side);
  }
}

class Circle {

  public void render() {
    System.out.println("This is a circle class.");
  }
}

class Square {

  public void render() {
    System.out.println("This is a Square class.");
  }
}

class Polygon extends Shape {

  @Override // Java Program to Demonstrate that Annotations these are Not Barely Comments.
  public void NumberOfSides(int side) {
    System.out.println("~ Number of sides of this shape is  : " + side);
  }
}

public class Polymorphism {

  public static void main(String[] args) {
    Shape shapeObj = new Shape();
    Square so = new Square();
    System.out.print("~ Calling render() : ");
    so.render();
    System.out.println("~ Example of method overloading : ");
    shapeObj.shapeName("Crazy");
    shapeObj.shapeName("Super crazy ", 10);
  }
}
