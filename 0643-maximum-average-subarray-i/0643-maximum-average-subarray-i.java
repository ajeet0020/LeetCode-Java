class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg = 0;

        for(int i = 0; i<= k -1; i++) {
            avg += nums[i];
        }

        double maxAvg = avg;

        for(int i = k; i<= nums.length-1; i++) {
            avg += nums[i] - nums[i - k];

            if(avg > maxAvg) {
                maxAvg = avg;
            }
        }
        return maxAvg / k;
    }
}