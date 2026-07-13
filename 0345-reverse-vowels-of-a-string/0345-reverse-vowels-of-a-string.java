class Solution {
    public String reverseVowels(String s) {
        char [] arr = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;

        String vowels = "AEIOUaeiou";

        while(start < end) {
            while (start < end && vowels.indexOf(arr[start]) == -1) {
                start++;
            }

            while (start < end && vowels.indexOf(arr[end]) == -1) {
                end--;
            }
            if (start < end) {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        return new String(arr);
    }
}