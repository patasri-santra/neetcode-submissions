class Solution {
    public int findMin(int[] nums) {
        // Arrays.sort(nums);
        // return nums[0];

        int result = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            result = Math.min(result, nums[i]);
        }

        return result;
    }
}
