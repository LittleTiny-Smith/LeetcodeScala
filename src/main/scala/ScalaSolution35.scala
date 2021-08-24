import java.util.Arrays

object ScalaSolution35 {
  /**
   * 搜索插入位置
   * 从一个排序数组中搜索一个目标值，如果存在则返回位置索引，如果不存在则返回应该插入的位置。
   * 采用二分搜索，找到则返回位置信息，未找到则返回下一个值的位置，用来插入
   *
   * @param nums
   * @param target
   * @return
   */
  def searchInsert(nums: Array[Int], target: Int): Int = {
    // print(Arrays.toString(nums), target)
    var mid: Int = nums.length / 2
    if (nums(mid) == target) {
      return mid
    } else if (nums(mid) > target) {
      var left: Array[Int] = Arrays.copyOfRange(nums, 0, mid)
      if (left.isEmpty) {
        return mid
      }
      return searchInsert(left, target)
    } else {
      var right: Array[Int] = Arrays.copyOfRange(nums, mid + 1, nums.length)
      if (right.isEmpty) {
        return mid + 1
      }
      return mid + 1 + searchInsert(right, target)
    }
  }

  def searchInsert2(nums: Array[Int], target: Int): Int = {
    var left = 0
    var right = nums.length - 1
    while (left <= right) {
      var mid: Int = left + (right - left) / 2
      if (nums(mid) == target) {
        return mid
      } else if (nums(mid) > target) {
        right = mid - 1
      } else {
        left = mid + 1
      }
    }
    return left
  }

  def main(args: Array[String]): Unit = {
    val nums: Array[Int] = Array(1, 3, 5, 6)
    var target = 7
    print(searchInsert2(nums, target))
  }

}
