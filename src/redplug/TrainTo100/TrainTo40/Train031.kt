package TrainTo100.TrainTo40

fun main(args: Array<String>) {
    println(cToF(30))
    println(getAverage(89,96))
}
fun cToF(celsius: Int): Double
{
    return celsius * 1.8 + 32
}
fun getAverage(a: Int, b: Int): Double
{
    return (a + b) / 2.0
}