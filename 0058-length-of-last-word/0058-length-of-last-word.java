class Solution {
    public int lengthOfLastWord(String s) {
        // 1. String ke end se faltu spaces hatao
        String str = s.trim();

        // 2. Last space ka index dhoondo
        int lastSpaceIndex = str.lastIndexOf(' ');

        // 3. Last word ki length hogi: (total length - 1) - lastSpaceIndex
        return str.length()-1-lastSpaceIndex;
    }
}