// Last updated: 7/17/2026, 2:58:58 PM
class Solution {
    public void sortColors(int[] nums) {
        int low = 0;               // Next position for 0
        int mid = 0;               // Current element
        int high = nums.length - 1; // Next position for 2

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else { // nums[mid] == 2
                swap(nums, mid, high);
                high--;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}