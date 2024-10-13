package searching;

public class LinearSearch {

    public static void main(String args[]) {
        int[] nums = {2, 12, 15, 11, 7, 19, 45};
        int target = 7;
        System.out.println("Nilai " + target + " berada pada indeks ke-" + search(nums, target));
    }

    static int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
    
}
