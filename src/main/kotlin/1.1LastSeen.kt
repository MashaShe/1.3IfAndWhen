
fun agoToText (secondsNotOnline:Int){
    when{
        secondsNotOnline<61 -> println("был(а) только что\n")
        secondsNotOnline<60*60 -> correctTextMin(secondsNotOnline/60)
        secondsNotOnline<24*60*60 ->correctTextHours(secondsNotOnline/60/60)
        secondsNotOnline<24*60*60*2 -> println("был(а) в сети сегодня\n")
        secondsNotOnline<24*60*60*3 -> println("был(а) в сети вчера\n")
        secondsNotOnline>24*60*60*3 -> println("был(а) в сети давно\n")
    }
}

fun correctTextHours(hoursNotOnline: Int) {
    when {
        hoursNotOnline<2 -> println("был(а) в сети ${hoursNotOnline} час назад\n")
        hoursNotOnline<5 -> println("был(а) в сети ${hoursNotOnline} часа назад\n")
        hoursNotOnline<20 -> println("был(а) в сети ${hoursNotOnline} часов назад\n")
        hoursNotOnline<22 -> println("был(а) в сети ${hoursNotOnline} час назад\n")
        hoursNotOnline<=24 -> println("был(а) в сети ${hoursNotOnline} часа назад\n")
    }
}

fun correctTextMin(minutesNotOnline:Int){
    if (minutesNotOnline<20 && minutesNotOnline>10)println("был(а) в сети ${minutesNotOnline} минут назад\n")
    else {
        when (minutesNotOnline % 10) {
            1 -> println("был(а) в сети ${minutesNotOnline} минуту назад\n")
            2, 3, 4 -> println("был(а) в сети ${minutesNotOnline} минуты назад\n")
            5, 6, 7, 8, 9, 0 -> println("был(а) в сети ${minutesNotOnline} минут назад\n")
            else -> println("Ошибка! Невероятное количество минут\n")
        }
    }
}