package leetcode.array;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA
 * Created By Bingyu wu
 * Date: 2017/11/23
 * Time: 下午10:41
 */
public class two_sum {

    public int[] twoSum(int[] nums,int target){
        int []result=new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {

                if (nums[i]+nums[j]== target){
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        two_sum  aa=new two_sum();
        int [] paramters=new int[]{3,2,4};
        int target=6;
        int [] result=aa.twoSum(paramters,target);
        System.out.println(Arrays.toString(result));

    }
}
