from typing import List

class Solution:
    def getSneakyNumbers(self, nums: List[int]) -> List[int]:
        count = 0
        sneaky = list()
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                if nums[i] == nums[j]:
                    sneaky.append(nums[i])
                    count += 1
            if count == 2:
                return sneaky