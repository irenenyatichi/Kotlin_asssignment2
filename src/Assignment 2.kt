import com.sun.jdi.NativeMethodException

fun main() {
    name()
 val result=modulus(a = 20, b = 6)
 println(result)
    var number=add(c=1, d=2,e=4,f=10)
println(number)
    fact()
}
fun name() {
    val name="irene"
    println("hello irene")
}
fun modulus(a:Int, b:Int) :Int{
    val modulus=a%b
    return modulus

}
fun add(c:Int,d:Int,e:Int,f:Int ):Int {
    var sum= c+d+e+f
    return sum
}
fun fact() {
    val fact= "i love food"
    println(fact)
}




