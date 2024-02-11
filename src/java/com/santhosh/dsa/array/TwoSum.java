import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3, 3};
        int target = 6;
        int[] indices = solve(arr, target);
        System.out.println(indices[0] + " " + indices[1]);
    }

    private static int[] solve(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if(map.containsKey(complement)) return new int[]{i, map.get(complement)};
            map.put(arr[i], i);
        }
        return new int[]{0, 0};
    }
}
