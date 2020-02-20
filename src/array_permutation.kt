import java.util.*

class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = IntArray(commands.size)
        var count = 0
        for (c in commands) {
            var mArray = array.sliceArray(c.get(0)-1 .. c.get(1)-1)
            Arrays.sort(mArray)
            answer.set(count, mArray.get(c.get(2) - 1))
            count++
        }
        return answer
    }
}

fun main(){
    var array = intArrayOf(1, 5, 2, 6, 3, 7, 4)
    var commands = arrayOf(intArrayOf(2,5,3), intArrayOf(4,4,1), intArrayOf(1,7,3))
    var answer : IntArray = Solution().solution(array, commands)
    print(answer)
}

