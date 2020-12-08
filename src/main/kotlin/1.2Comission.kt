import kotlin.math.roundToInt

fun commision(cardType: String = "VK Pay",
              monthSum: Int = 0,
              transferSum: Int) {
    println("Вы хотите перевести ${transferSum / 100} руб.")
    println("Ваша комиссия составит - ${comissioncalc(cardType, monthSum, transferSum) / 100} руб. \n")
}

fun comissioncalc(cardType: String = "VK Pay",
                  monthSum: Int = 0,
                  transferSum: Int): Int {
    when (cardType) {
        "VK Pay" -> return 0
        "Mastercard", "Maestro" -> return masterComission(monthSum, transferSum)
        "Visa", "Мир" -> return visaComission(monthSum, transferSum)
        else -> return 0
    }
}

fun visaComission(monthSum: Int, transferSum: Int): Int {
    if (transferSum / 100 * 0.75 < 35 * 100) return 35 * 100
    else return (transferSum / 100 * 0.75).roundToInt()
}

fun masterComission(monthSum: Int, transferSum: Int): Int {
    if (monthSum < 75000 * 100) return 0
    else return (transferSum / 100 * 0.6 + 20 * 100).roundToInt()
}
