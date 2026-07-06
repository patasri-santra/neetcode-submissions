class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        int i=0;
        while(i<nums.length){
            int left = 1;
            int right = 1;
            int j=0;
            while(j<i){
                left *= nums[j];
                j++;
            }

            int z = i+1;
            while(z<nums.length){
                right *= nums[z];
                z++;
            }
            result[i] = left*right;
            i++;
        }
        
        return result;
    }
}  
