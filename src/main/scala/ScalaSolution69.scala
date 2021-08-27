
object ScalaSolution69 {

  /**
   * 求x的平方根
   * 结果只保留整数部分，因此通过二分法可以快速找到平方小于x的最大整数
   * 注：当x较大时，部分中值的平方超过Int的界限
   * @param x
   * @return
   */
  def mySqrt(x: Int): Int = {
    if (x < 2) return x
    var left: Int = 0
    var right: Int = x
    var mid: Int = 0
    while (left <= right) {
      mid = left + (right - left) / 2
      var mid2: Long = mid
      if (mid2 * mid2 == x) {
        return mid
      } else if (mid2 * mid2 > x) {
        right = mid - 1
      } else {
        left = mid + 1
      }
    }
    return right
  }

  def main(args: Array[String]): Unit = {
    print(mySqrt(2147395599))
  }

}
