import java.time.DayOfWeek
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.Month
import java.time.MonthDay

import java.util.*


fun main(){

    val current = LocalDateTime.now()
    println("the current time is $current")

    val date = LocalDate.now()
    println("the date today is $date")

    val time = LocalTime.now()
    println("the time is $time")
    val monthDay =MonthDay.now()
    println(monthDay)

    val month =Month.MARCH
    val day = DayOfWeek.WEDNESDAY
    println("the month is $month and tha day today is $day")
//    var nn =date.month
//    println(nn)
//    var dy = date.dayofweek
//    println(dy)
//    var yr = date.year
//    println(yy)



}

