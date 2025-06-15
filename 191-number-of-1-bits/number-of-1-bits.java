import java.math.BigInteger;

class Solution {
    public int hammingWeight(int n) {
        BigInteger binN = BigInteger.valueOf(n);
        String bin = binN.toString(2);
        int count = 0;
        for (int i = 0; i < bin.length(); i++){
            if (bin.charAt(i) == '1') count++;
        }
        return count;
    }
}