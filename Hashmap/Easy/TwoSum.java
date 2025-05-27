package TwoPointer.Easy;

public class TwoSum{
    public static int[] twoSum(int[] nums, int target){
        int left = 0, right = nums.length-1;
        while(left<=right){
            int sum = nums[left] + nums[right];
            if(sum == target){
                return new int[]{left,right};
            }
            else if (sum < target){
                left++;
            }
            else{
                right--;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String args[]){
        int nums[]={1,2,3,4,5,6};
        int target = 3;
        int result[] = twoSum(nums,target);
        System.out.println(result[0] + " " + result[1]);
        // Output: 0 1 (since nums[0] + nums[1] = 1 + 2 = 3)
    }
}