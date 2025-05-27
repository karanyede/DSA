class Solution {
    //Most efficient solution for this problem
    public int[] twoSum(int[] nums, int target) {
        //We are creating a Hashmap with 
        //key as difference beween target elemt and the index element
        //value as current index
        Map<Integer,Integer> map = new HashMap<>();
        // Loop through the array of numbers.
        for(int i=0;i<nums.length;i++){
            // Check if the current number exists as a key in the HashMap.
            // If it does, that means we have already encountered a number earlier in the array
            // such that its complement (target - number) equals the current number.
            Integer index = map.get(nums[i]);
            // If we find such a number, return the indices of the two numbers.
            if(index != null){
                return new int[]{index,i};
            }
            // Otherwise, calculate the complement (target - current number) and store it in the HashMap.
            // The key is the complement, and the value is the index of the current number.
            // This allows us to quickly check later if the complement exists in the array.
            map.put(target-nums[i],i);
        }
        // If no solution is found, return
        return new int[]{-1,-1};
    }
}
