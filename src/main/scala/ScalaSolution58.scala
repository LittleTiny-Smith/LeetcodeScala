object ScalaSolution58 {

  /**
   * 最后一个单词长度
   * 通过正则匹配去除最后的空格，然后通过空格分割后取最后一个字符串
   * @param s
   * @return
   */
  def lengthOfLastWord(s: String): Int = {
    var str = s.replaceAll("\\s+$", "")
    val arr: Array[String] = str.split(" ")
    return arr(arr.length - 1).length
  }

  /**
   * 通过end找到最后一个单词结尾的位置，通过start找到最后一个单词开头的位置
   * @param s
   * @return
   */
  def lengthOfLastWord2(s: String): Int = {
    var end = s.length - 1
    while (end > 0 && s(end) == ' ') end -= 1
    if (end < 0) return 0
    var start = end
    while (start > 0 && s(start) != ' ') start -= 1
    return end - start
  }

}
