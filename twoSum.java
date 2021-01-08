//LC TWO SUM

class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
    Map<Integer,Integer> hashTwoSum = new HashMap<>();
    int arrayLength = nums.length;
    for(int i = 0; i<arrayLength;i++) hashTwoSum.put(nums[i],i);
    
    int[] res = new int[2];
    for(int i = 0;i<arrayLength;i++)
    {  
        int complement = target - nums[i];
        if(hashTwoSum.containsKey(complement)&&hashTwoSum.get(complement)!=i)
        {
            res[0]=i;
            res[1]=hashTwoSum.get(complement);
        }
    }
return res;
    }
   
}
