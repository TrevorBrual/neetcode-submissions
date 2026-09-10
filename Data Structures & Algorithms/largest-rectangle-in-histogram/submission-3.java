class Solution { // Optimized One pass
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();
        int n = heights.length;

        for(int i = 0; i <= n ; i++){
            // Treat the out of bounds index 'n' as height 0
            // This forces the while loop to trigger and pop everything left in the stack
            int currentHeight = (i == n) ? 0 : heights[i];

            // If we find a dip, resolve the areas of the taller bar we are popping
            while(!stack.isEmpty() && currentHeight < heights[stack.peek()]){
                int height = heights[stack.pop()]; // Height of the rectangle we are popping
                int width;
                if(stack.isEmpty()){
                    width = i;
                } else {
                    width = i - stack.peek() - 1;
                } 
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }
        return maxArea;
    }
}
