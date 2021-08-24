import scala.util.control._

object ScalaSolution14 {
  def longestCommonPrefix(strs: Array[String]): String = {
    var result: String = strs(0)
    for (i <- 1 to strs.length - 1) {
      result = commonPrefix(result, strs(i))
    }
    return result
  }

  def commonPrefix(str1: String, str2: String): String = {
    val minLength: Int = if (str1.length < str2.length) str1.length else str2.length
    var result: String = "";
    val loop = new Breaks;
    loop.breakable(for (i <- 0 to minLength - 1) {
      if (str1.charAt(i) == str2.charAt(i)) {
        result += str1.charAt(i)
      } else {
        loop.break;
      }
    })
    return result
  }

  def main(args: Array[String]): Unit = {
    var strs: Array[String] = Array("flower", "flow", "flight")
    print(longestCommonPrefix(strs))
  }
}
