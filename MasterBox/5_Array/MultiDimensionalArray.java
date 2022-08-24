//Array part II
// ~ Creating 2D array :
// int [][] arr = new int[2][3];
// here 2 is number of rows and 3 is the number of column of the array
// lets create it :

public class MultiDimensionalArray {

  public static void main(String[] args) {
    //~ Creation of array
    System.out.println("~ Creating 2D array : int[][] arr = new int[2][3];");
    int[][] arr = new int[2][3];
    // More valid syntax to create it :
    //int arr [][] = new int [2][3];
    //int []arr[]  = new int [2][3];

    //~ locations can be visualized as
    //                [0]     [1]     [2]
    //               Col-1   Col-2   Col-3
    //[0]  row[1]    (0,0)   (0,1)   (0,2)
    //[1]  row[2]    (1,0)   (1,1)   (1,2)

    //~ Adding elements in 2D Array
    // arr[0][0] = 1;  here in first [] we have giver row number and in second [] we have give column number. Which is the index of the given element which we want to add
    arr[0][0] = 1;
    arr[0][1] = 2;
    arr[0][2] = 3;
    arr[1][0] = 4;
    arr[1][1] = 5;
    arr[1][2] = 6;
    // or
    int[][] newArr = { { 1, 2, 3 }, { 4, 5, 6 } };
    // Trick : count {} as row and elements in that { } as number of col
    //        | 1   2   3 |
    //        | 4   5   6 |

    //~ Accessing 2D array elements
    // I. By index
    System.out.println("~ Accessing 2D array elements by index :");
    System.out.println("newArr[0][0] : " + newArr[0][0]);
    System.out.println("newArr[0][1] : " + newArr[0][1]);
    System.out.println("newArr[0][2] : " + newArr[0][2]);
    System.out.println("newArr[1][0] : " + newArr[1][0]);
    System.out.println("newArr[1][1] : " + newArr[1][1]);
    System.out.println("newArr[1][2] : " + newArr[1][2]);
    //~ Accessing 2D array elements by loop
    System.out.println("~ Accessing 2D array elements by loop :");
    int rowNumber = 2;
    int colNumber = 3;
    for (int i = 0; i < rowNumber; i++) {
      for (int j = 0; j < colNumber; j++) {
        System.out.print(newArr[i][j] + " ");
      }
      System.out.println();
    }
  }
}
