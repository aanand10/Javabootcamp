import javax.sound.sampled.SourceDataLine;
import javax.swing.Renderer;

//& Polymorphism : the word polymorphism contains its meaning "poly" means many and "morphism" means may ways.
// The real world example of this is yourself. As you play many roles at a time because you are a student, you are brother/sister , son/daughter, etc. at the same time this show many roles/ forms of single person.
//This is achieved by :
//  1) Method overriding
//  2) Method overloading
//Example:              Shape
//                 ↙     ↓     ↘
//            Triangle  Circle  Rectangle
//# render() method behaves differently in different classes. Or, we can say render() is polymorphic.
class Shape {

  public void render() {
    System.out.println("This a shape class.");
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

public class Polymorphism {

  public static void main(String[] args) {
    Square so = new Square();
    so.render();
  }
}
