class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int numsLength = nums.length;
        
        if (numsLength == 1 && nums[0] < target) {
            return 1;
        } else if (numsLength == 1 && nums[0] >= target) {
            return 0;
        }
        
        
        int insertPosition = binarySearch(nums, 0, nums.length-1, target);
        
        if (insertPosition == numsLength-1 && nums[insertPosition] < target) {
            return numsLength;
        } else {
            return insertPosition;
        }
    }
    
    public int binarySearch(int[] nums, int startIndex, int endIndex, int target) {
        int midIndex = (startIndex + endIndex) / 2;
        
        if (startIndex == endIndex) {
            return startIndex;
        }
        
        if (nums[midIndex] == target) {
            return midIndex;
        } else if (nums[midIndex] < target) {
            return binarySearch(nums, midIndex+1, endIndex, target);
        } else {
            return binarySearch(nums, startIndex, midIndex, target);
        }
    }
}
