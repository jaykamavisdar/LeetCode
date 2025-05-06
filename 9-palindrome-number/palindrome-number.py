class Solution:
    def isPalindrome(self, x: int) -> bool:
        # if x < 0:
        #     return False
        
        # if x == 0:
        #     return True
        
        # div = 1
        # while x // div >= 10:
        #     div *= 10
        
        # while x > 0:
        #     left = x // div
        #     right = x % 10
            
        #     if left != right:
        #         return False
            
        #     x = (x % div) // 10
        #     div //= 100
        
        # return True

        if x > -1:
            strX = str(x)
            if strX == strX[::-1]:
                return True
            else:
                return False
        return False