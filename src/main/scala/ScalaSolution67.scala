object ScalaSolution67 {
  /**
   * 二进制加法
   * 可以直接转换为十进制然后计算，当二进制太长时会失效
   * 模拟二进制计算过程
   * @param a
   * @param b
   * @return
   */
  def addBinary(a: String, b: String): String = {
    var result: StringBuffer = new StringBuffer()

    var len: Int = Math.max(a.length, b.length)
    var carry: Int = 0

    for (i <- 0 to len - 1) {
      if (i < a.length) carry += Integer.parseInt(a(a.length - 1 - i).toString)
      if (i < b.length) carry += Integer.parseInt(b(b.length - 1 - i).toString)
      result.append(carry % 2)
      carry /= 2
    }
    if (carry > 0) {
      result.append(1)
    }
    result.reverse()
    return result.toString
  }


  def main(args: Array[String]): Unit = {
    var a = "111"
    var b = "1"
    println(addBinary(a, b))
  }
}
