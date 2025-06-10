class Solution:
    def reverseWords(self, s: str) -> str:
        s = s.strip()
        l = s.split()
        rev = ""
        for i in range(len(l) - 1, -1, -1):
            rev = rev + l[i] + " "
        return rev.strip()