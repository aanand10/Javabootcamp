//Control statements
//There are two types of control statements in java
// 1. Conditional (if-else,else-if, switch case)
// 2 . Iteration or loops (for , for each, while, etc)
// !Note: for syntax please refer handwritten notes
public class Conditionals {

  public static void main(String[] args) {
    System.out.println("~~ Conditionals ~~ \n~ if-else statement.");
    int age = 21;
    // if else statement
    if (age >= 18) {
      System.out.println("You are allowed in party");
    } else {
      System.out.println("You are not allowed in party.");
    }
    // here else is not mandatory only "if" also can be used

    // else if statement
    System.out.println("~ else if statement");
    if (age <= 0) {
      System.out.println("Please check your age.");
    } else if (age >= 18) {
      System.out.println("You are allowed in party");
    } else {
      System.out.println("You are not allowed in party.");
    }
    //Switch case
    // in java we can pass int , char and string as arguments in switch case.
    // break is necessary other wise your loop can go on infinity.
    System.out.println("~ Switch case");
    int toyNumber = 2;
    switch (toyNumber) {
      case 1:
        System.out.println("Ballon");
        break;
      case 2:
        System.out.println("Gun");
        break;
      case 3:
        System.out.println("Phone");
        break;
      case 4:
        System.out.println("Bat");
        break;
      case 5:
        System.out.println("Ball");
        break;
      default :  // if anything is not answer then this will be printed
        System.out.println("You got nothing. Have a great day!");  
    }
    //Enhance switch
    // in this switch case method no need of break statement
    System.out.println("~ Enhance switch case");
    switch (toyNumber) {
      case 1->
        System.out.println("Ballon");
      case 2,3,4 ->  // this can't be done in normal switch case 
        System.out.println("You got nothing");
      case 5 ->
      System.out.println("Bat");  
    }
    // we can use switch case as a expression also
    // like
    // int itemCode = 2;
    // enum Day {
	// 	MON, TUE, WED, THUR, FRI, SAT, SUN
	// };
    // public static Boolean isWeekDayV2 (Day day)
	// {
	// 	Boolean result = switch(day) {
	// 		case MON, TUE, WED, THUR, FRI ->
	// 		{
	// 			System.out.println("It is WeekDay");
	// 			yield true;
	// 		}
	// 		case SAT, SUN ->
	// 		{
	// 			System.out.println("It is Weekend");
	// 			yield false;
	// 		}
	// 	};
	// 	return result;
	// }
    // System.out.println(isWeekDayV2(Day.MON));
  }
}
