def call(int value1, int value2) {
    try {
    def res = new Divide().Divide(value1, value2)

    println "$res"
    }
    catch(Exception e) {
    println("Exception: ${e}")
     }
    return this
}