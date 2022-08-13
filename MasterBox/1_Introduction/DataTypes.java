//Data Types : there are mainly 8 data types in java.
// byte , short, int ,long, double, float, char and boolean
public class DataTypes {

  public static void main(String[] args) {
    byte a = 2;
    //Breakdown:  here byte is data type , a is variable and 2 is value assigned to it
    short b = 25;
    int c = 25836;
    long d = 589632;
    float e = 3.333333f; // while using we need to use f as a suffix
    double f = 3.3333333;
    char g = 'g'; // in java char supports unicode also. SO it have size of 2 bytes
    boolean h = true; // it can have true or false value only
    System.out.println("Data types are as follow :");
    System.out.println(" byte : " + a);
    System.out.println(" short : " + b);
    System.out.println(" int : " + c);
    System.out.println(" long : " + d);
    System.out.println(" float : " + e);
    System.out.println(" double : " + f);
    System.out.println(" char : " + g);
    System.out.println(" boolean : " + h);
  }
}
