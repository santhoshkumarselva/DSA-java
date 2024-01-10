import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] indices = solve(arr, target);
        System.out.println(indices[0] + " " + indices[1]);
    }

    private static int[] solve(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if(map.containsKey(complement)) return new int[]{map.get(complement), i};
            map.put(arr[i], i);
        }
        return new int[]{0, 0};
    }
}
