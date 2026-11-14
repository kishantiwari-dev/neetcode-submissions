class Solution {
    public int trap(int[] height) {
        int ans=0;
        int maxl=0;
        int maxr=0;
        int left=0;
        int right=height.length-1;
        while(left<right)
        {
            maxl=Math.max(height[left],maxl);
            maxr=Math.max(height[right],maxr);
            if(maxl<maxr)
            {
                ans+=(maxl-height[left]);
                left++;
            }
            else
            {
                ans+=(maxr-height[right]);
                right--;
            }

        }
        return ans;
    }
}
