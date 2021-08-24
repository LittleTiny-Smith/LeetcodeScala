object ScalaSolution07 {
  def reverse(x: Int): Int = {
    var num = x;
    var res = 0
    while (num != 0) {
      var tmp = num % 10
      if (res > Int.MaxValue / 10 || res < Int.MinValue / 10) return 0;
      res = res * 10 + tmp;
      num /= 10
    }
    return res
  }

  def main(args: Array[String]): Unit = {
    val x = 1534236469
    print(reverse(x))
  }
}
