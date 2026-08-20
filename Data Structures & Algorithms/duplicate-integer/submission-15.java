class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        boolean ans = false;
        HashSet<Integer> duplicates = new HashSet<Integer>();

        for(int i = 0; i < nums.length; i++){
            if(duplicates.contains(nums[i])){

                return true;

            }
            else{

                duplicates.add(nums[i]);
            }
        }    
     return ans;
    }
    
}