class Solution { // Iterative Binary Search
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while(l <= r){
            int m = l + ((r - l) / 2); // The midpoint
            if(nums[m] > target){
                r = m - 1; // Moves the search to the left half
            } else if (nums[m] < target){
                l = m + 1; // Moves the search to the right half
            } else {
                return m;
            }
        }
        return -1;
    }
}
