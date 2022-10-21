//& Encapsulation : we can say it is the process of grouping the various things together. Ex. : Medicine capsule whose cover/ shell encapsulates all ingredients in it.
//~ It is one of the important feature of the OOP
//~ Encapsulation is also used to achieve data hiding . Encapsulation in itself is not data hiding.

// This main class is encapsulating various things like variables and method in it.
class Main {

  // variables
  int id = 85;
  String name = "Anand";

  //method
  public void showIdName() {
    System.out.println("Id is " + id + " and name is " + name);
  }
}

//& Data hiding :Data hiding is a way of restricting the access of our data members by hiding the implementation details. Encapsulation also provides a way for data hiding.
//Example :
class DataHiding {

  //Private variable : this can't be accessed from outside of this class.
  private int pId;

  //getter method
  public int getter() {
    return pId;
  }

  // setter method
  public void setter(int pId) {
    this.pId = pId;
  }
}

public class Encapsulation {

  public static void main(String[] args) {
    Main mo = new Main();
    mo.showIdName(); //accessing Main class methods using main class reference .
    DataHiding dho = new DataHiding();
    // dho.pID = 10; this can't be done
    // we need to access it through getter and setter methods
    dho.setter(10);
    System.out.println("Id : " + dho.getter());
  }
}
