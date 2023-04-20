class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        left=self.binSearch(nums, target, True)
        right=self.binSearch(nums, target, False)
        return[left, right]


    # 왼쪽 편향에서 false 라면 오른쪽 편향이 true 
    def binSearch(self, nums, target, leftBias):
        l, r= 0, len(nums) - 1
        i = -1

        while l <=r:
            m = (l + r) //2
            if target > nums[m]:
                l = m + 1
            elif target  < nums[m]:
                r=m-1
            else:
                i = m
                #여기 부분이 일반 이진 분류에서 편향 관련 식 추가
                if leftBias:
                    r = m - 1
                else:
                    l = m + 1
        return i
