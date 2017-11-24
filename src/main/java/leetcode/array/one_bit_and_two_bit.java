package leetcode.array;

/**
 * Created with IntelliJ IDEA
 * Created By Bingyu wu
 * Date: 2017/11/23
 * Time: 下午10:17
 */
public class one_bit_and_two_bit {

    public boolean isOneBitCharacter(int[] bits){

        for (int i = 0; i <bits.length; i++) {

            if(i==(bits.length-1)){
                return  true;
            }
            if (bits[i]==1){
                i++;
            }


        }

        return false;
    }

    public static void main(String[] args) {
        one_bit_and_two_bit aa=new one_bit_and_two_bit();
        int []bb={1,0,0};
        System.out.println(aa.isOneBitCharacter(bb));

    }
}
