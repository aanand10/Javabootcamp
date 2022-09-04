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

//Static keyword : Static data can't be accessed directly from the non static method but non-static data can be accessed by static method.
//! Static and Non-Static methods :
//~ Static method : we can call these methods directly there is no need to use object to call them. but through static methods we cat't can non static methods.
//~ Non-static method : we can't call these methods directly with their name we have to access them by the object.
//! Note : for more info about static keyword must refer handwritten notes.

//! Method Overloading : methods having same name but different parameters, these methods are called as overloaded methods and the process is called as overloading.
//e.g.: Anand want to create a method 'area' to calculate the area of his hostel rooms but problem is that some rooms are rectangular in shape and some are in square. So here method overloading can be used to achieve this.

//! Variable arguments(varargs) : using the method we can pass values as much we want

public class Method {

  // Anand have created method to add two numbers where 'void' is the return type of the method 'sum' is the name of method and 'num1' and 'num2 ' are the parameters of method which we need to pass while calling the method.

  void sum(int num1, int num2) {
    int answer = num1 + num2;
    System.out.println("Sum of the given two numbers is : " + answer);
  }

  //Let's create a method which will return a value
  int sub(int num1, int num2) {
    int answer = num1 - num2;
    return answer; // this will return a value
  }

  //~~ Method overloading : Lets create two area() methods with different parameters
  //~ Square rooms area :
  void area(int side) {
    System.out.println("Area of the square room is : " + side * side);
  }

  //~ Rectangle rooms area :
  void area(int length, int breadth) {
    System.out.println("Area of the rectangular room is : " + length * breadth);
  }

  //! Variable arguments part :
  //~ Let's create a sum method which can add all the numbers which are given as input
  void sum(int... arr) {
    int sum = 0;
    for (int element : arr) {
      sum = sum + element;
    }
    System.out.println("Sum of the given numbers is : " + sum);
  }

  public static void main(String[] args) {
    // As we have learnt before, for accessing elements in we have to create an object of the class to access them.
    Method obj = new Method(); // new object is created
    //! Calling method :
    // methodName(parameter-if-required);
    //~ As Anand want to sum five times he will call sum method for five times
    //! Calling sum method :
    // As sum method is non static method so we have to use object to access/call that method
    System.out.println("~~ Methods : \n# Calling Method :");
    obj.sum(12, 10);
    obj.sum(22, 10);
    obj.sum(72, 10);
    obj.sum(992, 21);
    obj.sum(0, 10);
    //! Calling sub method :
    obj.sub(100, 90); // this will return a value but it will not be visible we have to print it. To see int's output lets print it
    System.out.println(
      "# Calling sub method which returns  a value : " + obj.sub(100, 90)
    ); // this will show us output
    //! Method overloading  :
    System.out.println("# Method overloading :");
    obj.area(5); // for area of square
    obj.area(5, 7); // for area of rectangle
    //! Variable arguments :
    System.out.println("# Calling variable arguments method : ");
    obj.sum(10, 12, 14, 16, 18, 20);
  }
}
}
