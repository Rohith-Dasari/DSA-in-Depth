class Solution {
    public void moveZeroes(int[] nums) {
       int len=nums.length; 
       int l=0;
       for(int r=0; r<len;r++){
        if(nums[r]!=0){
            int temp=nums[r];
            nums[r]=nums[l];
            nums[l]=temp;
            l++;
        }
       }    
    }
}