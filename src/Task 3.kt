fun main(){
    var a: Int = 2
    println("Введите число")
    var n: Int= Integer.valueOf(readLine())
    while (n % a !=0) a++
    println("Наименьший делитель числа : $a")
}