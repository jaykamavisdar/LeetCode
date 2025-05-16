class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        ans = []
        for i in range(len(nums)):
            for j in range(i+1, len(nums)):
                if nums[i] + nums[j] == target:
                    if (i or j) in ans:
                        continue
                    else:
                        ans.append(i)
                        ans.append(j)
        return ans