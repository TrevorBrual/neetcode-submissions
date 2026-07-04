class Solution { // Min Heap
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // Creates the minHeap
        for(int num : nums){ // Loops through the array nums
            minHeap.offer(num); // Adds the int values of num into the heap
            if(minHeap.size() > k){ // Checks if the size of the heap is larger than k
                minHeap.poll(); //Retrieves and removes the head of the queue or returns null if empty
            }
        }
        return minHeap.peek(); // Retrieves the head of the queue or returns null if empty
    }
}
