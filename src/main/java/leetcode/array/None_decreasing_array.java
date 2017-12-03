package leetcode.array;

/**
 * Created with IntelliJ IDEA
 * Created By Bingyu wu
 * Date: 2017/11/29
 * Time: 下午10:09
 */
public class None_decreasing_array {
    public boolean checkPossibility(int[] nums) {

        int count = 0;

        for (int i = 1; i < nums.length; i++) {


            if (nums[i - 1] <= nums[i]) {

            } else {
//                if (i != 1 && i != nums.length - 1 && ) {
//                    return false;
//                }

                if (i != 1 && i != nums.length - 1) {


                    if (nums[i - 1] > nums[i + 1]) {
                        if (nums[i - 2] <= nums[i]){

                        }else{
                            return false;
                        }

                    }

                }

                if (count == 0) {
                    count++;
                } else {
                    return false;
                }
            }
        }


        return true;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 4, 2, 3};
        None_decreasing_array aa = new None_decreasing_array();
        System.out.println(aa.checkPossibility(nums));

    }
}
