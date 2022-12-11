package com.example.homework_1

fun main() {
//    Hocam, aşağıdakı örnekleri kodu test etmek için yazdım
//    Ödev 2-e ait bütün fonskiyonları bu faylda yazdım
//    println(celciusToFarenheit(10.0))
//    println(areaOfRectangle(3.0, 4.0))
//    println(factorial(5))
//    println(numberOfAs("a MammadAbc"))
//    println(sumOfInteriorAngles(5))
//    println(salaryCalculator(10))
//    println(price(51))
}

fun celciusToFarenheit(degree: Double): Double {
    return 1.8 * degree + 32
}

fun areaOfRectangle(width: Double, height: Double): Double {
    return width * height
}

fun factorial(number: Int): Long {
    var res = 1L
    for (i in 2..number) {
        res *= i
    }
    return res
}

fun numberOfAs(str: String): Int {
    var cnt = 0
    for (i in 0 until str.length) {
        if (str[i] == 'a') {
            cnt++
        }
    }
    return cnt
}

fun sumOfInteriorAngles(n: Int): Int {
    return 180 * (n - 2)
}

fun salaryCalculator(day: Int): Int {
    if (8 * day <= 160) {
        return 80 * day
    }
    return 1600 + (8 * day - 160) * 20
}

fun price(kota: Int): Int {
    return if (kota <= 50) 100 else 100 + (kota - 50) * 4
}

