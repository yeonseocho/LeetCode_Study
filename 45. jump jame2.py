
class Solution:
    def jump(self, nums: List[int]) -> int:
        result =0
        lpoint = rpoint =0

        while rpoint < len(nums) -1:
            far = 0
            for i in range(lpoint, rpoint +1):
                far = max(far, i + nums[i])
            lpoint = rpoint + 1
            rpoint = far
            result +=1
        return result
