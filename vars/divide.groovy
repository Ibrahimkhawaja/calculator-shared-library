def call(int value1, int value2) {
    try {
    def res = new Divide().Div(value1, value2)

    println "$res"
    }
    catch(Exception e) {
    println("Exception: ${e}")
     }
    return this
}