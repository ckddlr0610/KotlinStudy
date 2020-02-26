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

        while (!(coin==0)){
            coin = coin%500
            coin = coin%100
            coin = coin%50
        }

        /*while (coin>=500){
            coin = coin%500
            count[0]++
        }
        while (coin>=100){
            coin = coin%100
            count[1]++
        }
        while (coin>=50){
            coin = coin%50
            count[2]++
        }
        while (coin>=10){
            coin = coin%10
            count[3]++
        }
        while (coin>=5){
            coin = coin%5
            count[4]++
        }
        while (coin>=1){
            coin = coin%1
            count[5]++
        }*/
        return count
    }
}

fun main() {
    var greedy = GreedyAlgo()
    var solution : IntArray = greedy.solution(600)
    for (i in solution){
        println(i)
    }
}