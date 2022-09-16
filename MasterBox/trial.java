public class trial {

  public static void main(String[] args) {
    try {
      int n = 1000, x = 0;
      int arr[] = new int[n];
      for (int i = 0; i <= n; i++) {
        arr[i] = i / x;
      }
    } catch (ArrayIndexOutOfBoundsException exception) {
      System.out.println("1st block = ArrayIndexOutOfBoundsException");
    } catch (ArithmeticException exception) {
      System.out.println("2nd block = ArithmeticException");
    } catch (Exception exception) {
      System.out.println("3rd block = Exception");
    }
  }
}
