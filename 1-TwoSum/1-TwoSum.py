# Last updated: 7/9/2026, 10:07:16 AM
class Solution:
    def twoSum(self, num, target):
        num_map = {}
        
        for i , num in enumerate(num):
            complement = target - num
            
            if complement in num_map:
                return [num_map[complement] ,i]
                
            num_map[num] = i
        