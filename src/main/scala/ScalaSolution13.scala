object ScalaSolution13 {
  /**
   * 罗马字符转换为数值
   * 罗马字符规律，当一个小值在一个大值前面时，需要做减法。
   * 即：
   * 'I'可以放在'V'(5)和'X'(10)的左边，来表示4和9。
   * 'X'可以放在'L'(50)和'C'(100)的左边，来表示40和90。
   * 'C'可以放在'D'(500)和'M'(1000)的左边，来表示400和900。
   *
   * @param s
   * @return
   */
  def romanToInt(s: String): Int = {
    val arr: Array[Char] = s.toCharArray
    var result: Int = 0
    for (i <- 0 to arr.length - 1) {
      if (i == arr.length - 1) {
        result += romanToNumber(arr(i))
      } else {
        if (romanToNumber(arr(i)) <
          romanToNumber(arr(i + 1))) {
          result -= romanToNumber(arr(i))
        } else {
          result += romanToNumber(arr(i))
        }
      }
    }
    return result
  }

  def romanToNumber(c: Char): Int = {
    return c match {
      case 'I' => 1
      case 'V' => 5
      case 'X' => 10
      case 'L' => 50
      case 'C' => 100
      case 'D' => 500
      case 'M' => 1000
    }
  }

  def main(args: Array[String]): Unit = {
    print(romanToInt("MCMXCIV"))
  }

}
