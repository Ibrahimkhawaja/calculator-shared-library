
class Divider {
    def Divide(int x, int y) {
    try {
         return x/y
    }
    catch (ArithmeticException e) {
      System.out.println(e.getMessage())
    }
}
}
