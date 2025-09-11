package exercises;

import java.util.Arrays;

public class LargestNumber {

    public static String formLargestNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return "";
        }

        // Convert to string array
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        // Sort using custom comparator
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        // If the largest is "0", then all are zeros
        if (arr[0].equals("0")) {
            return "0";
        }

        // Build result
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }

        return sb.toString();
    }
}

