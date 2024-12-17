class Solution {
    var maxCnt = 0
    lateinit var visited: BooleanArray
    
    fun solution(k: Int, dungeons: Array<IntArray>): Int {
        visited = BooleanArray(dungeons.size)
        dfs(k, dungeons, 0)
        return maxCnt
    }
    
    fun dfs(k: Int, dungeons: Array<IntArray>, cnt: Int) {
        maxCnt = maxOf(maxCnt, cnt)
        
        for (i in dungeons.indices) {
            if (!visited[i] && k >= dungeons[i][0]) {
                visited[i] = true
                dfs(k - dungeons[i][1], dungeons, cnt + 1)
                visited[i] = false
            }
        }
    }
}