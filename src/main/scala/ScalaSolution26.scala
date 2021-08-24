
object ScalaSolution26 {

  /**
   * 删除有序数组中的重复元素
   * 通过快慢指针，慢指针用来标注非重复元素位置，快指针用来判断是否是非重铸元素
   * 返回非重复下的元素个数，并将这些元素放在数据开头位置
   *
   * @param nums
   * @return
   */
  def removeDuplicates(nums: Array[Int]): Int = {
    if (nums == null) return 0
    if (nums.length <= 1) return nums.length

    var i = 1;
    var j = 1;
    while (j < nums.length) {
      if (nums(j) != nums(j - 1)) {
        nums(i) = nums(j)
        i += 1
      }
      j += 1
    }

    return i
  }

  def main(args: Array[String]): Unit = {
    val nums: Array[Int] = Array(0, 0, 1, 1, 1, 2, 2, 3, 3, 4);
    val len = removeDuplicates(nums);
    for (i <- 0 to len - 1) {
      println(nums(i))
    }
  }

}
