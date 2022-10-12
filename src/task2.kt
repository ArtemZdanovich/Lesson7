fun main() {
    println("Введите высоту проема")
    var r: Int = Integer.valueOf(readLine())
    println("Введите ширину проема")
    var s: Int = Integer.valueOf(readLine())
    println("Введите высоту кирпича")
    var a: Int = Integer.valueOf(readLine())
    println("Введите ширину кирпича")
    var b: Int = Integer.valueOf(readLine())
    println("Введите длину кирпича")
    var c: Int = Integer.valueOf(readLine())

    when {
        r >= a && s >= b -> println("ok")
        r >= b && s >= c -> println("ok")
        r >= c && s >= a -> println("ok")
        r >= b && s >= a -> println("ok")
        r >= c && s >= b -> println("ok")
        r >= a && s >= c -> println("ok")

        else -> {
            println("no")
        }

    }

}