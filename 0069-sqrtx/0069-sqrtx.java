class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        
        int start = 1;
        int end = x;
        int ans = 0;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            // Using division (mid <= x / mid) instead of multiplication (mid * mid <= x)
            // prevents integer overflow bugs.
            if (mid <= x / mid) {
                ans = mid;     // mid could be the answer, but keep looking for a larger one
                start = mid + 1;
            } else {
                end = mid - 1; // mid is too large
            }
        }
        
        return ans;
    }
}