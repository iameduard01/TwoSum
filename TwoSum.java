import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <nums.length; i++){
            int cur = nums[i];
            // cur + x = target
            // x = target - cur
            int x = target - cur;
            if (map.containsKey(x)) {
//                System.out.println(map.get(x) + " " + i);
                return new int[] { map.get(x), i };
            }
            map.put(cur,i);
        }
        return null;
    }

    public static void main(String[] args) {
        twoSum(new int[] {2,7,11,15}, 9);
    }
}
