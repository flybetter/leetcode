package leetcode.array;

/**
 * Created with IntelliJ IDEA
 * Created By Bingyu wu
 * Date: 2017/11/23
 * Time: 下午10:17
 */
public class one_bit_and_two_bit {

    public boolean isOneBitCharacter(int[] bits){
      if (bits.length==1){
          return true;
      }else {
        if (bits[bits.length-2]== 1){
            if (bits[bits.length-3]== 1){

            }else{

            }
            return false;
        }else {
            return true;
        }
      }

    }

    public static void main(String[] args) {

    }
}
