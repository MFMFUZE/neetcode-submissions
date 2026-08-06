class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean hasDuplicates = false;
        for(int i = 0; i < nums.length; i++){
           for(int j = 0; j < i && j < nums.length; j++){
           
            if(nums[i] == nums[j]){
                hasDuplicates = true;
            }
           }
        }
        return hasDuplicates;

    }
}