class Solution {

    private int[] targetBoundary = new int[2];
    private boolean isTarget = false;

    public int[] searchRange(int[] nums, int target) {
        targetBoundary[0] = nums.length - 1;
        targetBoundary[1] = 0;

        sortMerge(0, nums.length - 1, nums, target);

        if (!isTarget) {
            targetBoundary[0] = -1;
            targetBoundary[1] = -1;
        }

        return targetBoundary;
    }

    public void sortMerge(int startIndex, int endIndex, int[] nums, int target) {
        
        if (startIndex > endIndex || nums[startIndex] > target || nums[endIndex] < target) {
            return;
        }

        if (startIndex == endIndex) {
            if (nums[startIndex] == target) {
                isTarget = true;
                if (startIndex <= targetBoundary[0]) {
                    targetBoundary[0] = startIndex;
                }
                if (endIndex >= targetBoundary[1]) {
                    targetBoundary[1] = endIndex;
                }
            }
            return;
        }

        int midIndex = (startIndex + endIndex) / 2;

        sortMerge(startIndex, midIndex, nums, target);
        sortMerge(midIndex + 1, endIndex, nums, target);
    }
}
