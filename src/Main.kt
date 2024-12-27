fun main() {
    val array = arrayOf(1,0,3,4,5,6,7,8,0,5,11,-12,13,14,-10,16,17,16,20,14)
    println(array.contentDeepToString())
    println("Проверка если в массиве локальные минимумы и возвращает число локальных минимумов: "
            + checksIfArrayHasLocalMinimaAndReturnsNumberOfLocalMinima(array))
    println()
    println(array.contentDeepToString())
    println("Если в нем имеются отрицательные элементы, то необходимо увеличить этот элемент на единицу" +
            " и вернуть массив.")
    println(negativeElementsThenYouNeedToIncreaseThisElementByOne(array).contentDeepToString())
    println()
    val arrayTwo = arrayOf(arrayOf(1,2,3,4,5),
        arrayOf(6,7,8,9,10),
        arrayOf(11,12,13,14,15),
        arrayOf(16,17,18,19,20),
        arrayOf(21,22,23,24,25))
    println(arrayTwo.contentDeepToString())
    val K = 1
    println("Вывести элементы $K строки данной матрицы: " + printElementsOfKthRowOfThisMatrix(arrayTwo, K)
        .contentDeepToString())
    println()
}

/*
1. Написать функцию, на вход которой поступает массив из произвольного количества элементов.
Данная функция проверяет, если в массиве локальные минимумы и возвращает число локальных минимумов.
(локальный минимум – это когда два соседних элемента больше того, что между ними, например, 5,2,7).
*/
fun checksIfArrayHasLocalMinimaAndReturnsNumberOfLocalMinima(array: Array<Int>): Int {
    if (array.size < 3) return 0
    var count = 0
    for (i in 1..< array.size - 1) if (array[i] < array[i - 1] && array[i] < array[i + 1]) count++
    return count
}

/*
2. Напишите функцию, в которой проверяется созданный Вами массив целых чисел.
Если в нем имеются отрицательные элементы, то необходимо увеличить этот элемент на единицу и вернуть массив.
*/
fun negativeElementsThenYouNeedToIncreaseThisElementByOne(array: Array<Int>): Array<Int>{
    for (i in array.indices) if (array[i] < 0) array[i]++
    return array
}

/*
3. Дана матрица размера M×N и целое число K (1≤K≤M).
Вывести элементы K-й строки данной матрицы.
*/
fun printElementsOfKthRowOfThisMatrix(array: Array<Array<Int>>, K: Int): Array<Int>{
    if (K >= array.size || K < 0) throw Exception("K не соответствует размеру массива")
    return array.get(K)
}

/*
Примечания:
Для вывода значений на экран используйте функцию println().
*/