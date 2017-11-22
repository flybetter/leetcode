package leetcode.array;

/**
 * Created with IntelliJ IDEA
 * Created By Bingyu wu
 * Date: 2017/11/22
 * Time: 下午10:25
 */
public class find_pivot_index {

    public static int pivotIndex(int[] nums) {
        Integer size = nums.length;

        for (int i = 0; i < size; i++) {

            Integer left = left(0, i, nums);
            System.out.println("left:"+left);
            Integer right = right(i, size-1, nums);
            System.out.println("right:"+right);
            if (left.equals(right)) {
                return i;
            }
        }

        return -1;
    }

    public static Integer left(Integer begin, Integer end, int[] nums) {

        Integer totalSum = 0;
        for (int i = 0; i < end; i++) {
            totalSum += nums[i];
        }
        return totalSum;
    }

    public static Integer right(Integer begin, Integer end, int[] nums) {

        Integer totalSum = 0;
        for (int i = begin+1; i <=end; i++) {
            totalSum += nums[i];
        }
        return totalSum;
    }

    public static void main(String[] args) {
        int []sum={1,7,3,6,5,6};
//        int []sum={-1,-1,-1,0,1,1};
        System.out.println(find_pivot_index.pivotIndex2(sum));
    }

    // it take too much time.

    public static int pivotIndex2(int[] nums) {

        int totalSum=0;

        for (int i = 0; i <nums.length; i++) {
            totalSum+=nums[i];
        }

        int leftValue=0;
        for (int i = 0; i <nums.length; i++) {

            int rightValue=totalSum-leftValue-nums[i];

            if (rightValue == leftValue){
                return i;
            }

            leftValue+=nums[i];

        }

        return -1;
    }

}
