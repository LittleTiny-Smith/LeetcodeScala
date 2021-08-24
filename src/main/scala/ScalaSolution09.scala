object ScalaSolution09 {

  def isPalindrome(x: Int): Boolean = {
    val arr: Array[Char] = String.valueOf(x).toCharArray
    var i: Int = 0
    var j: Int = arr.length - 1
    while (i < j) {
      if (arr(i) != arr(j)) {
        return false;
      }
      i += 1;
      j -= 1;
    }
    return true
  }

  /**
   * 是否是回文数
   * 通过取余与除法运算，将数字拆分为左右两边的数，然后比较
   * @param x
   * @return
   */
  def isPalindrome2(x: Int): Boolean = {
    if (x < 0 || (x % 10 == 0 && x != 0)) return false

    var m: Int = x
    var n: Int = 0
    while (m > n) {
      n = n * 10 + m % 10
      m = m / 10
    }

    return m == n || m == n / 10
  }


  def main(args: Array[String]): Unit = {
    println(isPalindrome2(123454321))
  }

}
