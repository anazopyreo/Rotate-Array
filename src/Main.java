import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] startingNums1 = {1,2,3,4,5,6,7};
        int[] startingNums2 = {-1,-100,3,99};

        int[] nums1 = {1,2,3,4,5,6,7};
        int k1 = 3;
        int[] output1 = {5,6,7,1,2,3,4};

        int[] nums2 = {-1,-100,3,99};
        int k2 = 2;
        int[] output2 = {3,99,-1,-100};

        System.out.println("\nTempArraySolution");
        TempArraySolution.rotate(nums1, k1);
        System.out.println(Arrays.equals(nums1, output1));
        TempArraySolution.rotate(nums2, k2);
        System.out.println(Arrays.equals(nums2, output2));

        nums1 = Arrays.copyOf(startingNums1,startingNums1.length);
        nums2 = Arrays.copyOf(startingNums2,startingNums2.length);

        System.out.println("\nArrayReversingSolution");
        ArrayReversingSolution.rotate(nums1, k1);
        System.out.println(Arrays.equals(nums1, output1));
        ArrayReversingSolution.rotate(nums2, k2);
        System.out.println(Arrays.equals(nums2, output2));
    }
}