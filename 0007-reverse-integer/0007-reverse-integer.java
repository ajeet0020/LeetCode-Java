class Solution {
    public int reverse(int x) {
     int revSum = 0;
     while (x != 0) {
        int lastDigit = x % 10;
        x = x /10;
        if (revSum > Integer.MAX_VALUE / 10 || (revSum == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
                return 0;
            }
            // Check for negative overflow
            if (revSum < Integer.MIN_VALUE / 10 || (revSum == Integer.MIN_VALUE / 10 && lastDigit < -8)) {
                return 0;
            }
        revSum = (revSum * 10) + lastDigit;
     }   
     return revSum;
    }
}