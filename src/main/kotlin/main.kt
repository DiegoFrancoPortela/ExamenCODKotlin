fun main(args: Array<String>) {
    // ----------------------------- EJERCICIO 1 ----------------------------------
    var claseArray = claseArray(11)

    claseArray.tabla6.forEach {
        println("6*${it / 6} = ${it}")
    }

    println("-----------")
    // ----------------------------------------------------------------------------
    // ----------------------------- EJERCICIO 2 ----------------------------------

    claseArray = claseArray(10)

    claseArray.arrayRandom.forEach {
        println(it)
    }

    println("-----------")
    // ----------------------------------------------------------------------------
}