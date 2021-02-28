fun main() {
    name()
    var result = modulus(7,2)
    println(result)
    var outcome = add(5,6,8,10)
    println(outcome)
    me()
}
fun name() {
    val myName = "Sarah"
    println("Hello " + myName)
}
fun modulus(num1:Int,num2:Int):Int {
    var remainder = num1 % num2

    return remainder
}
fun add(a:Int,b:Int,c:Int,d:Int):Int {
    var sum = a + b + c + d

    return sum
}
fun me() {
    var aboutMe = "Am a Diplomat"
    println(aboutMe)
}