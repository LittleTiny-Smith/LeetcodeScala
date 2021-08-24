import scala.collection.mutable.Stack

object ScalaSolution20 {

  /**
   * 有效的括号
   * 使用栈的特性，先入后出，对括号进行匹配
   * @param s
   * @return
   */
  def isValid(s: String): Boolean = {
    if (s.length % 2 == 1) return false

    val pairs: Map[Char, Char] = Map(')' -> '(', ']' -> '[', '}' -> '{')

    val arr: Array[Char] = s.toCharArray
    val stack = new Stack[Char]()
    for (elem <- arr) {
      if (pairs.keySet.contains(elem)) {
        if (stack.isEmpty || stack.pop() != pairs(elem)) return false
      } else {
        stack.push(elem)
      }
    }

    return stack.isEmpty
  }

  def main(args: Array[String]): Unit = {
    print(isValid("[()]{}"))
  }
}
