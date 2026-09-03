class Solution {
    public boolean uniformArray(int[] nums1) {
        int minVal = Integer.MAX_VALUE;
        boolean allEven = true;

        for (int num : nums1){
            if (num < minVal) {
                minVal = num;
            }
            if (num % 2 != 0) {
                allEven = false;
            }
        }
        return allEven || (minVal % 2 != 0);
    }
}