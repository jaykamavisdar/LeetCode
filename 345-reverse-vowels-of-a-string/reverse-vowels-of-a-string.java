class Solution {
    private boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c) != -1;
    }
    public String reverseVowels(String s) {
        char[] strArr = s.toCharArray();
        int left = 0;
        int right = strArr.length - 1;

        while (left < right){
            while (left < right && !isVowel(strArr[left])) left++;      //used to skip is left is not vowel
            while (left < right && !isVowel(strArr[right])) right--;    //used for right one

            char temp = strArr[left];       //otherwise swap left and right
            strArr[left] = strArr[right];
            strArr[right] = temp;

            left++;     //move the pointers
            right--;
        }
        return new String(strArr);
    }
}