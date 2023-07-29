class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> data = new HashSet<Integer>();  
     for (final int num : nums)
        if (!data.add(num))
            return true; 
     
    return false;
    }
}
