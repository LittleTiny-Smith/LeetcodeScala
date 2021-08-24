import scala.util.control._

object ScalaSolution28 {
  def strStr(haystack: String, needle: String): Int = {
    if (needle == null || needle.isEmpty) return 0

    var i: Int = 0
    var loop = new Breaks

    loop.breakable(
      while (i < haystack.length) {
        var j = 0
        loop.breakable(while (j < needle.length) {
          if (i + j >= haystack.length) loop.break()
          if (haystack(i + j) == needle(j)) {
            j += 1
          } else {
            loop.break()
          }
        })
        if (j == needle.length) {
          loop.break()
        }
        i += 1
      })
    if (i == haystack.length) return -1
    return i
  }

  def main(args: Array[String]): Unit = {
    var haystack: String = "aaaaaaaa"
    var needle: String = ""
    print(strStr(haystack, needle))
  }
}
