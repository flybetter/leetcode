package leetcode.array;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA
 * Created By Bingyu wu
 * Date: 2017/12/5
 * Time: 下午9:48
 */
public class RemoveDuplicateFromSortedArray {


    public int removeDuplicates(int[] nums) {

        int simpleLength=1;

        if (nums.length==0){
            return 0;
        }

        if (nums.length==1){
            return 1;
        }

        boolean flag=true;
        int i=0;
        int value=0;
        while(flag){
            if (i==nums.length-1||nums[i]>nums[i+1]){
               break;
            }
            if (nums[i]==nums[i+1]) {
                flag=this.moveParam(i,nums);
            }else {
                simpleLength+=1;
                i++;
            }
        }

        return simpleLength;
    }

    public boolean moveParam(int i,int []nums){
        boolean flag=false;
       int temp= nums[i];
        for (int j = i; j <nums.length-1 ; j++) {
            nums[j]=nums[j+1];
            if (temp!=nums[j+1]){
                flag=true;
            }
        }
        nums[nums.length-1]=temp;
        return flag;
    }

    public static void main(String[] args) {
        RemoveDuplicateFromSortedArray removeDuplicateFromSortedArray=new RemoveDuplicateFromSortedArray();
        int []nums={1,2,2,2,3,4,5};
        System.out.println(  removeDuplicateFromSortedArray.removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));

    }
}
