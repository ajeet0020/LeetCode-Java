class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;

        for(String pattern : patterns) {  //or ye for each loop hai 
            if (word.contains(pattern)) { // ye dekhe contains use isliye hua ki check karega ki ek bhi word match hua usko contains hai ki nhi .
                count++;
            }
        }
        return count;
    }
}