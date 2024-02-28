// Thanks ProfessionalMonk
// https://leetcode.com/problems/rotate-array/solutions/4006719/simple-beats-100
// Testing runtime = 0 ms
public class ArrayReversingSolution {
    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        int n = nums.length;
        reverseNum(nums,0,n-1);
        reverseNum(nums,0,k-1);
        reverseNum(nums,k,n-1);
    }
    public static void reverseNum(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}