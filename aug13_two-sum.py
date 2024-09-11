from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # dictionary
        seen = {}
        for i in range(len(nums)):
            compliment = target - nums[i]
            if compliment not in seen:
                seen[nums[i]] = i
            else:
                return [seen.get(compliment), i]


s = Solution()
print(s.twoSum([1,2,3], 4))
print(s.twoSum([1,2,3,5,4,7], 9))
        


# dictionary
# jack = {
#     'name': 'Jack',
#     'age': 16,
#     'games': ['valorant', 'fc online'],
#     1: 'python'
# }

# print(jack['age'])
# print(jack['games'][0] + ' is Jack\'s most favorite game')
# print(jack[1])