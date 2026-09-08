class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,j,c=0,a=0,b=0;
        for(i=0;i<nums.length;i++)
        { 
            for(j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    c=1;
                    a=i;
                    b=j;
                    break;
                }
            }
        }
        if(c==1)
        {
            return new int[]{a,b};
        }
    return new int[0];
    }
}
