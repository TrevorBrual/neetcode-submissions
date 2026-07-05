class Solution { // Binary Search (One pass)
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r){
            int mid = (l + r) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if(nums[l] <= nums[mid]){ // Checks the left sided portion of the array
                if(target > nums[mid] || target < nums[l]){ //If the target is strictly greater than our largest number in this half OR strictly less than our smallest number in this half, we know it is not in the left portion
                    l = mid + 1;
                } else {
                    r = mid - 1; //If we know its in the left portion, we eliminate the right portion by moving r
                }
            } else {
                if(target < nums[mid] || target > nums[r]){
                    r = mid - 1; // Same for this but for the right size
                } else {
                    l = mid + 1; // It must be on the right portion, so we eliminate the left
                }
            }
        }
        return -1;
    }
}
