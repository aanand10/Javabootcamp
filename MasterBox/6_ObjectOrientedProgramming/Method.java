//! Methods : ~ Methods are the block of the code.
// ~ they are declared in class
// ~ Code reusability is increased by use of the methods.
//~ e.g.: Anand want to add two numbers five times so in normal way he have to write (consider a and b two numbers) 'a+b' five times. but by using method he will just write an sum method and pass two parameters through it and he will call that method when he need.
//! Declaration of method in JAVA :
//     returnType methodName(parameter-list){
//      method-body
//    }
//! Method which dose not return anything then it's return type is void

//! There are two type of methods I. user defined methods
//!                              II. Standard library methods (in built java methods)

//! Static and Non-Static methods :
//! Static method : we can call these methods directly there is no need to use object to call them. but through static methods we cat't can non static methods.
// ! Non-static method : we can't call these methods directly with their name we have to access them by the object.

public class Method {

  void sum(int num1, int num2) {
    int answer = num1 + num2;
    System.out.println("Sum of the given two numbers is : " + answer);
  }

  // Anand have created method to add two numbers where 'void' is the return type of the method 'sum' is the name of method and 'num1' and 'num2 ' are the parameters of method which we need to pass while calling the method.

  public static void main(String[] args) {
    // As we have learnt before, for accessing elements in we have to create an object of the class to access them.
    Method obj = new Method(); // new object is created
    //! calling method :
    // methodName(parameter-if-required);
    //~ As Anand want to sum five times he will call sum method for five times
    // As sum method is non static method so we have to use object to access/call that method
    obj.sum(12, 10);
    obj.sum(22, 10);
    obj.sum(72, 10);
    obj.sum(992, 21);
    obj.sum(0, 10);
  }
}
