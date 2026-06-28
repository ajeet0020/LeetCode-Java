class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        long totalSum = n * (n + 1) / 2;

        long arraySum = 0;
        
        for (int num : nums) {
            arraySum += num;
        }
        return (int)(totalSum - arraySum);
    }
}