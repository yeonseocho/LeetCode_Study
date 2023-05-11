class Solution:
    
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        res = []
        self.DFS(sorted(candidates),target,0,[],res)
        return res
    def DFS(self, nums,target,idx,path,res):
        if target == 0 : 
            res.append(path)
        elif target < 0 :
            return
