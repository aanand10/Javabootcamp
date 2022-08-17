//Array : ~ Array is collection of same data type of values
// ~ Array is class in java
// ~ Types of array : 1. one dimensional array or 1D array
//                   2. multi dimensional array
// ~ Index of elements in array stats by 0 and goes upto (n-1), where n is the total number of elements in an array
public class Array {

  public static void main(String[] args) {
    // Creation of array
    System.out.println(
      "Creation of the array\n ~ syntax : data-type [] arrayName; "
    ); // for basic syntax please refer handwritten notes in the array folder
    int[] arr = new int[5]; // int : type of data type which array we want to create
    //  [] : take it as it is for 1D array
    // arr : reference or variable
    // new  : used to allocation of memory
    // 5 : length of an array. It can be given in int , short, byte,char

    // methods to crate an array
    //1.
    int[] marks; // Deceleration
    marks = new int[5]; // Memory allocation
    //2.
    int[] marksNew = { 91, 96, 85, 20, 14 }; // Declaration + Initialization
    //3.
    int[] marksFinal = new int[5]; // Declaration + Memory allocation
    //4.
    int[] marksLast = new int[] { 92, 53, 58, 99, 25 }; // this is also valid syntax
  }
}
