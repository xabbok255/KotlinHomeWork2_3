fun calcPrice(amount: Int, regularCustomer: Boolean): Int {
    val res = if (amount in 0..1000) {
        amount
    }
    else if (amount in 1001..10000) {
        amount - 100
    }
    else {
        (amount * 0.95).toInt()
    }

    return if (regularCustomer) (res * 0.99).toInt() else res
}

fun main() {
    println(calcPrice(500, false))
    println(calcPrice(500, true))

    println(calcPrice(1250, false))
    println(calcPrice(1250, true))

    println(calcPrice(11200, false))
    println(calcPrice(11200, true))
}