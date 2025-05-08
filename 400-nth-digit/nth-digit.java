class Solution {
    public int findNthDigit(int n) {
        // StringBuilder nStr = new StringBuilder();
        // for (int i = 1; i <= n; i++) {
        //     nStr.append(i);
        // }
        // // Extract the (n-1)th character and convert to integer
        // return Character.getNumericValue(nStr.charAt(n - 1));

        long len = 1;   // length of numbers in current group (1-digit, 2-digit, etc.)
        long count = 9; // count of numbers in current group
        long start = 1; // starting number of current group
        
        // Step 1: Find the length group
        while (n > len * count) {
            n -= len * count;
            len++;
            count *= 10;
            start *= 10;
        }
        
        // Step 2: Find the actual number
        long num = start + (n - 1) / len;
        
        // Step 3: Find the digit within the number
        String s = Long.toString(num);
        return Character.getNumericValue(s.charAt((n - 1) % (int)len));
    }
}