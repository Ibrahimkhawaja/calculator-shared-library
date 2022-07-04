class Divide {
  
  def Div(int x, int y) {
  
  try { 
        return x/y
    }
      
  catch (ArithmeticException e) {
            // Exception handler
            System.out.println(e.getMessage());
        }
  }
}
