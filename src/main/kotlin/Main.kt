fun main(args: Array<String>) {
    val number = getUserInput("Please enter a number to calculate to find if it is prime")
    if (number != null) {
        val isNumPrime = isPrime(number)
        if (isNumPrime) {
            println("the number is prime")
        }
        else{
            println("the number is not prime")
        }
    }
}

fun isPrime(number: Int) : Boolean {
    if (number <= 1)
        return false;
    for (i in 2..number / 2) {
        if (number % i == 0)
            return false;
    }
    return true;
}

fun getUserInput(outputMessage: String): Int? {
    println(outputMessage)
    return readLine()?.toInt()
}