fun main() {
    println("Введите возраст")

    var age: Int = Integer.valueOf(readLine())

    when {
        age == 200 -> {
            println("Некорректный ввод")
        }
        age %100 in 11..19 -> {
            println("$age лет")
        }

        age %10 == 1  -> {
            println("$age год")
        }

        age %10 in 2..4 -> {
            println("$age года")
        }


        else -> {
            println("$age лет")
        }


    }
}