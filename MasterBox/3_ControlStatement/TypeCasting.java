//Type casting :
//This happens when we assign value of one data type to another. It have two types
// 1. Implicit type casting : this is automatically done by the compiler | Small => large | no data loss
// 2. Explicit type casting : this is manually or explicitly done | Large => small | data loss happens
public class TypeCasting {

  public static void main(String[] args) {
    // Type casting
    System.out.println("~~ Type casting ~~\n~ Implicit type casting");
    int num1 = 52;
    float num2 = num1;
    //now if we print num2 , we will get type casted value of num1
    System.out.println("52 get implicitly type cast :" + num2);
    System.out.println("\n~ Explicit type casting");
    float num3 = 58.10f;
    int num4 = (int) num3; // ~ for explicit type casting we must have to mention the data type in which we want to type cast the variable or item. ~ Here data has been loosed (data after of the decimal point
    System.out.println("58.10 get explicitly type cast :" + num4);
  }
}
