
class Divide {
    def Div(int x, int y) {
    try {
         return x/y
    }
    catch (ArithmeticException e) {
      System.out.println(e.getMessage())
    }
}
}
