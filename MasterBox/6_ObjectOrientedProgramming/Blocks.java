//~ Blocks in java :
//We are going to see about : instance block and static block
//! The preference give to
// Static block
//      ↓
// Instance Block
//      ↓
// Constructor
//! Note : for more details do check handwritten notes in the folder.
public class Blocks {
  // Static block : JVM executes static blocks before the main method at the time of class loading.
  static {
    System.out.println(
      "Hello , from static block. I have highest precedence among these."
    );
  }

  //Instance block
  {
    System.out.println(
      "Hello , from instance block. I have the higher precedence constructor and lower than static block."
    );
  }

  //   constructor
  Blocks() {
    System.out.println(
      "Hello , from constructor of this class. I have lower precedence than instance block."
    );
  }

  public static void main(String[] args) {
    Blocks blocksObject = new Blocks();
    // as object of the class is also called as instance of the class ,So as object get created instance block is called.
  }
}
