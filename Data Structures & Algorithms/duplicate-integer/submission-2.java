class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        int i,c=0,store;
        for(i=0;i<nums.length;i++)
        {
            store=nums[i];
            for(int j=i+1;j<nums.length;j++)
            {
            if(nums[i]==nums[j])
            {
            c++;
            i++;
            }
            }
        }
        if(c>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}