package searching;

public class BinarySearch {

    public static void main(String args[]) {
        int[] nums = {2, 12, 15, 17, 27, 29, 45};
        int target = 45;
        System.out.println(search(nums, target));
    }

    static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else if(nums[mid] > target) {
                end = mid - 1;
            }
        }
        return -1;
    }
}
