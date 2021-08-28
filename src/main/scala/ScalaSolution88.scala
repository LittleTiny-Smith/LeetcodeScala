import java.util.Arrays

object ScalaSolution88 {

  /**
   * 合并两个排序数组，num1数组长度为m+n并作为结果返回
   * 倒序双指针，正序需要有一个额外的数组
   *
   * @param nums1
   * @param m
   * @param nums2
   * @param n
   */
  def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {
    val nums3: Array[Int] = Arrays.copyOfRange(nums1, 0, m)
    var x = 0
    var y = 0
    for (i <- 0 to m + n - 1) {
      if (x < m && y < n) {
        if (nums2(y) < nums3(x)) {
          nums1(i) = nums2(y)
          y += 1
        } else {
          nums1(i) = nums3(x)
          x += 1
        }
      } else {
        if (x >= m && y < n) {
          nums1(i) = nums2(y)
          y += 1
        }
        if (y >= n && x < m) {
          nums1(i) = nums3(x)
          x += 1
        }
      }
    }
  }

  /**
   * 倒序双指针
   * @param nums1
   * @param m
   * @param nums2
   * @param n
   */
  def merge2(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {
    var x = m - 1
    var y = n - 1
    while (x >= 0 && y >= 0) {
      if (x < 0) {
        nums1(x + y + 1) = nums2(y)
        y -= 1
      } else if (y < 0) {
        nums1(x + y + 1) = nums1(x)
        x -= 1
      } else if (nums1(x) < nums2(y)) {
        nums1(x + y + 1) = nums2(y)
        y -= 1
      } else {
        nums1(x + y + 1) = nums1(x)
        x -= 1
      }
    }
  }


  def main(args: Array[String]): Unit = {
    val nums1: Array[Int] = Array(1, 2, 3, 0, 0, 0)
    val nums2: Array[Int] = Array(2, 4, 6)
    merge2(nums1, 3, nums2, 3)
    println(nums1.toSeq)
  }

}
