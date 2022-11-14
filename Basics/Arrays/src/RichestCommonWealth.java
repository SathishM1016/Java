public class RichestCommonWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3},
                {3,2,1}
        };
        int ans = maximumWealth(accounts);
        System.out.println(ans);
    }
    static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
