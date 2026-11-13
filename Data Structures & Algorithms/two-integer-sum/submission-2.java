class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> set=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int rem=target-nums[i];
            if(set.containsKey(rem))
            {
                return new int[]{set.get(rem), i};
            }
            set.put(nums[i], i);

        }
        return new int[]{};
    }
}
