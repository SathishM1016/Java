public class TwoSums {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(sum(nums,target));
    }
    public static int[] sum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++)
            nums[i] += nums[i + 1];
            return nums;
            }

    }


