class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }

        int count = 0;
        for(int j=0; j<nums.length; j++){
            int num = nums[j];
            int n=0;
            while(set.contains(num)){
            n +=1;
            count =Math.max(count,n);
            num = num+1;
        }
        }

        return count;
    }
}
