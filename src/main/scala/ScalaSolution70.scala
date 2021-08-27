object ScalaSolution70 {

  /**
   * 爬楼梯
   * 面对n阶楼梯，可以一次等1阶或是2阶，问有多少种登法
   * 动态规划 f(x) = f(x - 1) + f (x - 2)
   *
   * @param n
   * @return
   */
  def climbStairs(n: Int): Int = {
    if (n == 1) return 1
    if (n == 2) return 2
    if (n == 3) return 3
    return climbStairs(n - 1) + climbStairs(n - 2)
  }

  def climbStairs2(n: Int): Int = {
    var p = 0
    var q = 0
    var r = 1
    for (i <- 1 to n) {
      p = q
      q = r
      r = p + q
    }
    return r
  }

  /**
   * 矩阵快速幂
   * @param n
   * @return
   */
  def climbStairs3(n: Int): Int = {
    var q: Array[Array[Int]] = Array(Array(1, 1), Array(1, 0))
    var res: Array[Array[Int]] = pow(q, n)
    return res(0)(0)
  }

  def pow(a: Array[Array[Int]], n: Int): Array[Array[Int]] = {
    var x = n
    var arr = a
    var ret: Array[Array[Int]] = Array(Array(1, 0), Array(0, 1))
    while (x > 0) {
      if ((x & 1) == 1) {
        ret = multiply(ret, arr)
      }
      x >>= 1
      arr = multiply(arr, arr)
    }
    return ret
  }

  def multiply(a: Array[Array[Int]], b: Array[Array[Int]]): Array[Array[Int]] = {
    var c: Array[Array[Int]] = Array.ofDim[Int](2, 2)
    for (i <- 0 to 1) {
      for (j <- 0 to 1) {
        c(i)(j) = a(i)(0) * b(0)(j) + a(i)(1) * b(1)(j)
      }
    }
    return c
  }

  def main(args: Array[String]): Unit = {
    println(climbStairs3(5))
  }
}