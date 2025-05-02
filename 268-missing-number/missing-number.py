class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        for i in range(len(nums)):
            if (i not in nums):
                return i
            elif (len(nums) not in nums):
                return len(nums)
        return 0