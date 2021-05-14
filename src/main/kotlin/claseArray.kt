import kotlin.random.Random

class claseArray (var tamañoArray:Int) {

    val tabla6 = Array<Int>(tamañoArray) { it * 6 }
    val arrayRandom =  Array<Int>(tamañoArray) {Random.nextInt(50,250)}

}