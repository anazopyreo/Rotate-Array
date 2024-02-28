// Testing runtime = 1 ms
public class TempArraySolution {
    public static void rotate(int[] nums, int k) {
        // if(nums.length < 2) return;
        k = k % nums.length;
        int[] temp = new int[k];
        int j = 0;
        for(int i = nums.length - k; i < nums.length; i++){
            temp[j++] = nums[i];
        }
        j = 0;
        for(int i = nums.length - 1; i >= k; i--){
            nums[i] = nums[i - k];
        }
        for(int i = 0; i < temp.length; i++){
            nums[i] = temp[i];
        }
    }
}