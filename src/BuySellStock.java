import java.util.Scanner;

public class BuySellStock {

    static int solve(int[] arr) {
        if(arr.length < 2) return 0;
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] < minPrice) minPrice = arr[i];
            else if((arr[i] - minPrice) > maxProfit) maxProfit = arr[i] - minPrice;
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array");;
        n = sc.nextInt();
        System.out.println("Enter the values");
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solve(arr));
    }
}
