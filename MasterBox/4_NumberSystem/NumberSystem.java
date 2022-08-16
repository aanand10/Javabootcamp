import java.util.Scanner;

public class NumberSystem {

  public static void main(String[] args) {
    // Number system
    System.out.println("\n~~ Number system :");
    int decimalNumber = 10; // decimal number
    int binaryNumber = 0b101110; // binary number
    int octalNumber = 02535; // octal number
    int hexaDecimalNumber = 0x2564f; // hexadecimal number
    System.out.println(
      "Decimal number (numbers that we use) : " + decimalNumber
    );
    System.out.println("Binary number 0b101110 value : " + binaryNumber);
    System.out.println("Octal number 02535 value : " + octalNumber);
    System.out.println(
      "Hexadecimal number 0x2564f value : " + hexaDecimalNumber
    );
    // Input :
    // Taking input of these numbers like binary , octal , hexadecimal
    Scanner sc = new Scanner(System.in); // scanner class object is created . Scanner class in java is used to take input from user
    System.out.println("\n~~ Taking input of various type of numbers :");
    //  Decimal number input
    System.out.print("Enter your decimal number : ");
    int yourDecimalNumber = sc.nextInt();

    //  Binary number input
    System.out.print("Enter your binary number : ");
    int yourBinaryNumber = sc.nextInt(2); // The base is given in bracket it is also called as radix
    // binary numbers have base 2 , octal have 8 and hexadecimal have 16

    //  Octal number input
    System.out.print("Enter your octal number : ");
    int yourOctalNumber = sc.nextInt(8);

    //Hexadecimal number
    //  Octal number input
    System.out.print("Enter your Hexadecimal number : ");
    int yourHexadecimalNumber = sc.nextInt(16);

    System.out.println(
      ">> Your entered decimal number is : " + yourDecimalNumber
    );
    System.out.println(
      ">> Your entered binary number is : " + yourBinaryNumber
    );
    System.out.println(">> Your entered octal number is : " + yourOctalNumber);
    System.out.println(
      ">> Your entered hexadecimal number is : " + yourHexadecimalNumber
    );

    // ASCII values : some values can't displayed on terminal you can check full table of this in the folder file ASCII.text
    char a = 0;
    System.out.println("\n~~ ASCII values ");
    for (int i = a; a <= 177; a++) {
      System.out.println("ASCII value of " + (int) a + " is : " + a);
    }
  }
}
