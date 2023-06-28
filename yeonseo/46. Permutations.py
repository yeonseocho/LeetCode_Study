class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        result = []

        #case 1
        if (len(nums) == 1):
            return [nums[:]]

        for i in range(len(nums)):
            n=nums.pop(0)
            perms = self.permute(nums)

                #pop 시킨 첫번째 값 다시 

            for perm in perms:
                perm.append(n)
            result.extend(perms)
            nums.append(n)

        return result
