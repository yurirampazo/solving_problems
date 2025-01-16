import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'compareTriplets' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {

var c = Array<Int>(2) {0}
 for (i in 0 until a.size) {
    // or use for (i in 0 .. a.size - 1) {  
    /*because arrays in Kotlin are 0-based). The valid index range for arrays is from 0 to a.size - 1. 
    So, you should use 0 until a.size instead of 0 .. a.size. 
    The until keyword generates a range up to (but not including) the specified value. */
    if (a[i] > b[i]) {
        c[0]++
    } else if (a.get(i) < b.get(i)) {
       c[1]++
    }
 }
 return c
}

fun main(args: Array<String>) {

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}
