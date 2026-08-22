class Solution {
    public boolean checkDivisibility(int n) {
        int temp = n;    // ye hai ki n value ko temp me store kar rahe hai 
        int sum = 0;        // yaha sum ko store karwa rahe hai 
        int prod = 1;   // yaha multiply ko

        // while loop check karega ki temp 0 se bada hai ki nhi 
        while (temp > 0) {
            int digit = temp % 10;  // yaha digit ko nikal ke add or prod me store kar rahe hai 
            sum += digit; // yaha store ho raha hai sum 
            prod *= digit; // yaha store ho raha hai multiple
            temp /= 10; // yaha digit ko remove kar rahe hai num se
        }
        return  n % (sum + prod) == 0;   // yaha check kar rahe mtlb output match kar raha hai ki 
    }
}