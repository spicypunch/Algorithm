class Solution {
   fun solution(sizes: Array<IntArray>): Int {
       var maxWidth = 0
       var maxHeight = 0
       
       for (card in sizes) {

           val width = maxOf(card[0], card[1])
           val height = minOf(card[0], card[1])
           
           maxWidth = maxOf(maxWidth, width)
           maxHeight = maxOf(maxHeight, height)
       }
       
       return maxWidth * maxHeight
   }
}