class Solution { // Sorting
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> output = new ArrayList<>();
        output.add(intervals[0]);

        for(int[] interval : intervals){
            int start = interval[0]; // Extract the start of the array
            int end = interval[1]; // Extract the end of the array
            int lastEnd = output.get(output.size() - 1)[1];

            if(start <= lastEnd){
                output.get(output.size() - 1)[1] = Math.max(lastEnd, end);
            } else {
                output.add(new int[]{start, end});
            }
        }
        return output.toArray(new int[output.size()][]);
    }
}
