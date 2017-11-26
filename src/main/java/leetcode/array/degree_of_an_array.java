package leetcode.array;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA
 * Created By Bingyu wu
 * Date: 2017/11/26
 * Time: 下午4:02
 */
public class degree_of_an_array {
    public int findShortestSubArray(int[] nums) {

        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) != null) {
                map.put(nums[i], handleValue(map.get(nums[i]), nums[i], i));
            } else {
                map.put(nums[i], 1 + "_" + i + "_" + 0);
            }
        }
        System.out.println(map.toString());

        Integer topfrequency = 0;
        Integer topDistance = 0;

        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Integer key = (Integer) iterator.next();
            String value = map.get(key);
            String[] values = value.split("_");
            // frequency_begin_distance
            Integer frequency = Integer.parseInt(values[0]);
            Integer begin = Integer.parseInt(values[1]);
            Integer distance = Integer.parseInt(values[2]);
            if (topfrequency < frequency) {
                topfrequency = frequency;
                topDistance = distance;
            } else if (topfrequency.equals(frequency)) {
                if (topDistance > distance) {
                    topDistance = distance;
                }
            }

        }


        return topDistance + 1;
    }


    public String handleValue(String oldValue, int num, int i) {
        String[] values = oldValue.split("_");
        // frequency_begin_distance
        Integer frequency = Integer.parseInt(values[0]);
        Integer begin = Integer.parseInt(values[1]);
        Integer distance ;

        frequency += 1;
        distance = i - begin;

        return frequency + "_" + begin + "_" + distance;

    }


    public static void main(String[] args) {
        degree_of_an_array object = new degree_of_an_array();
        int[] nums = {1, 2, 2, 3, 1};
        System.out.println(object.findShortestSubArray(nums));

    }
}
