// Loops:
// there are used to do repetitive tasks like we want to print number from 1 to 100
// There are primarily 3 types of loops
// i. while loop
// ii. do while loop
// iii. for loop
// There is also a "for each loop" which is used to iterate an array. which is covered in array part
public class Loops {

  public static void main(String[] args) {
    System.out.println("~~ Loops ~~ \n~ while loop");
    int num1 = 1;
    int num2 = 5;
    // while loop
    while (num1 < num2) {
      // this will keep executing until the condition is true
      System.out.println("I'm from while loop.");
      break; // break statement is used get out of the loop or stop the execution of the loop
    }
    // do while loop
    System.out.println("~ do while loop");

    do {
      System.out.println("I'm from do while loop"); // this will execute at least once although the condition is not true
      num1++; // used to increment the number (this is covered in Operators and Expressions)
    } while (num1 < num2);

    // for loop : used mainly for repetitive operations for number of times
    System.out.println("\n~ for loop");
    for (int i = 1; i <= 10; i++) { //for (initialization , condition check , update)
      System.out.println("id number : " + i); // this will execute until condition is true
    }
  }
}
