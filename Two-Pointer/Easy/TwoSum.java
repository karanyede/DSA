public class TwoSum{
  //Simple to understand
  //We need two pointers left and right(variables)
  //find their sum and if it is equals to the target reurn the index(left,right)
  //if not check the target if it is greater then incremet lefft is smaller then decrement right
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
    }
}
