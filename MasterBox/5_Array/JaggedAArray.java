//Array : PArt III
// Jagged array  : A jagged array is an array of arrays such that member arrays can be of different sizes.

public class JaggedAArray {

  public static void main(String[] args) {
    // creating jagged array
    int[][][] jaggedArr = {
      { { 1, 2, 3, 4, 5 } },
      { { 6, 7, 8 }, { 9, 10, 20, 40 } },
      { { 50, 51, 53 }, { 10, 11 }, { 21, 31 } },
    };
    // Proper visualization of this is given in notes so please do refer them.
    //lets try to Access elements from jaggedArr :
    System.out.println(
      "~~ Accessing the elements from Jagged Array \n~ By Index : "
    );
    // lets try to access 53
    System.out.println("jaggedArr[2][0][2] : " + jaggedArr[2][0][2]);
    //~ ! note : Try to detect the array number by the curly brackets {}
    //~ here you can refer this as
    //~ arrayName[firstArrayIndex][idexOfArrayInFirstArray][indexOfElement]

    System.out.println("~ By for loop : ");
    for (int i = 0; i < jaggedArr.length; i++) { // this will iterate for main array
      for (int j = 0; j < jaggedArr[i].length; j++) { // this will iterate further array according to index
        for (int k = 0; k < jaggedArr[i][j].length; k++) { // this will iterate elements according to index
          System.out.print(jaggedArr[i][j][k] + " "); // this will print element of specific index
        }
        System.out.println();
      }
      System.out.println();
    }
  }
}
