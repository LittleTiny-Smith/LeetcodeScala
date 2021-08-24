import scala.util.control.Breaks

object ScalaSolution01 {
  def twoSum1(nums: Array[Int], target: Int): Array[Int] = {
    val loopBreak = new Breaks;
    for (i <- 0 to nums.length) {
      var value_i = nums(i)
      loopBreak.breakable {
        for (j <- i + 1 to nums.length) {
          var value_j = nums(j)
          if ((value_i + value_j) == target) {
            return Array(i, j)
          }
        }
      }
    }
    return Array(0, 0)
  }


  def twoSum2(nums: Array[Int], target: Int): Array[Int] = {
    var map: Map[Int, Int] = Map()
    for (i <- 0 to nums.length) {
      if (map.contains(target - nums(i))) {
        return Array(map(target - nums(i)), i)
      }
      map += (nums(i) -> i)
    }
    return Array(0, 0)
  }


  def main(args: Array[String]): Unit = {
    val array = Array(2, 7, 11, 15)
    val target = 9

    twoSum2(array, target).foreach(x => println(x))
  }
}