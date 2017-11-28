package leetcode.array;

/**
 * Created with IntelliJ IDEA
 * Created By Bingyu wu
 * Date: 2017/11/29
 * Time: 上午12:09
 */
public class LongestContinueIncreasingSubsequence {

    public static int findLengthOfLCIS(int[] nums) {

        int count = 1;

        int top=0;

        if (nums.length == 0) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            if (j < nums.length && nums[i] < nums[j]) {
                count++;
            } else {
                top= Math.max(top,count);
                count=1;
            }
        }

        return top;
    }

    public static void main(String[] args) {
        int[] nums = { 1,3,5,2,3,4,5};
        System.out.println(LongestContinueIncreasingSubsequence.findLengthOfLCIS(nums));

    }

}
