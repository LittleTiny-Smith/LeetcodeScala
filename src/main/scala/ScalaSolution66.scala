

object ScalaSolution66 {

  /**
   * 加一
   * 一个由整数的各位组成的数组，执行加一运算
   * 特殊情况，最高位进一
   * @param digits
   * @return
   */
  def plusOne(digits: Array[Int]): Array[Int] = {
    var i = digits.length - 1
    var modNumber = 1
    while (i >= 0 && modNumber == 1) {
      var num = digits(i) + modNumber
      if (num >= 10) {
        num = num % 10
        modNumber = 1
      } else {
        modNumber = 0
      }
      digits(i) = num
      i -= 1
    }
    if (modNumber == 1) {
      var result: Array[Int] = new Array[Int](digits.length + 1)
      result(0) = 1
      for (i <- 1 to result.length - 1) {
        result(i) = digits(i - 1)
      }
      return result
    } else {
      return digits
    }
  }

  def main(args: Array[String]): Unit = {
    var digits: Array[Int] = Array(9,9)
    plusOne(digits).foreach(x => {
      println(x)
    })
  }

}
