// We have used operators and expressions. WHere operator does the operations in between of operands.
// like 7 + 10 = 17 , here 7 and 10  are operands and "+" is an operator and 17 is the result
// There are some types of operators
// 1. Arithmetic operators (+,-,*,/,%,++,--)
// 2. Assignment operator (= , +=)
// 3. Comparison operator ( ==,< , > , <= , >= , !=)
// 4. Logical operators (|| , && ) this only works on boolean values
// 5. Bitwise operator (&,|,^)
public class OperatorsAndExpression {

  public static void main(String[] args) {
    // lets use them
    int a = 52;
    int b = 25;
    boolean one = true;
    boolean two = false;
    System.out.println("Some operations using the operators :");
    System.out.println("a+b = " + (a + b));
    System.out.println("a-b = " + (a - b));
    System.out.println("a/b = " + (a / b));
    System.out.println("a*b = " + (a * b));
    System.out.println("a%b = " + (a % b));
    System.out.println("a++ = " + a++);
    System.out.println("++a =" + ++a);
    System.out.println("a-- =" + a--);
    System.out.println("--a =" + --a);
    System.out.println("a == b = " + (a == b));
    System.out.println("a < b = " + (a < b));
    System.out.println("a > b = " + (a > b));
    System.out.println("a <= b = " + (a <= b));
    System.out.println("a >= b = " + (a >= b));
    System.out.println("a != b = " + (a != b));
    System.out.println("a | b = " + (a | b));
    System.out.println("a & b = " + (a & b));
    System.out.println("a ^ b = " + (a ^ b));
    System.out.println("one && two = " + (one && two));
    System.out.println("one || two = " + (one || two));
  }
}
