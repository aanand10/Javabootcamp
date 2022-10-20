//&Abstraction : it means hiding unnecessary details and showing only valuable information to user.
//^ EX.1 : As we use Google search engine we only search and results are shown to us but how the searching algorithm is working those details are not known to us.
//^ EX.2 : If I book a uber auto only the necessary details like fair, auto number , drivers name and vehicle's name is shared with user.But the details about how app is working, what is drivers age, fuel in auto , etc is not shared with the user because there is no need to tell them about to us.

class UberAuto {

  public int fair = 56;
  public String autoNumber = "MH15AS1010";
  public String driversName = "Raju Bhai";
  public String vehicleName = "Bajaj RE";
  private int driversAge = 30;
  private int fuelInAutoInLiters = 5;

  // this will hide info from user which does not need to known to user
  private void internalInfo() {
    System.out.println("*** Private info***\nDrivers age is " + driversAge);
    System.out.println("Fuel in the auto is " + fuelInAutoInLiters);
  }

  abstract class trynew {

    abstract void method1();
  }

  // this method will only show the required info to the user.
  public void rideInfo() {
    System.out.println(
      "*** Public info ***\nFair cost is " +
      fair +
      "RS .\nAuto number is " +
      autoNumber +
      ".\nDrivers name is " +
      driversName +
      ".\nVehicles name is " +
      vehicleName +
      "."
    );
  }
}

public class Abstraction {

  public static void main(String[] args) {
    UberAuto uo = new UberAuto();
    uo.rideInfo();
  }
}
