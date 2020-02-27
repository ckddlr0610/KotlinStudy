/**
 * acmicpc.net/problem/5585
 * Greedy Algorithm problem
 */
class GreedyAlgo {
    private var coin = 0
    private var count = IntArray(6)
    private var coinArr = arrayOf(500, 100, 50, 10, 5, 1)

    fun solution(price : Int): IntArray {
        coin = 1000-price

        for(i in 0..5) {
            var temp = coin / coinArr[i]
            count[i] += temp
            coin = coin - (coinArr[i]*temp)
        }

        return count
    }
}

fun main() {
    var greedy = GreedyAlgo()
    var solution = 0
    var count : IntArray = greedy.solution(600)
    for (i in count){
        solution += count[i]
    }
    println(solution)
}