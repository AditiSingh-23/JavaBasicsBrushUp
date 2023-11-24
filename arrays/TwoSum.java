package arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the complement of each element and its index
        Map<Integer, Integer> complementMap = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {

            complementMap.put(nums[i], i);
            int complement=target-nums[i];
            if(complementMap.containsKey(complement)) {
                return new int[]{complementMap.get(complement), i};
            }
        }
        for (Map.Entry<Integer, Integer> entry : complementMap.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());}

        // No solution found, return an empty array or throw an exception as per your requirement
        throw new IllegalArgumentException("No solution found");
    }




    public static void main(String[] args) {
        // Example usage
        int[] nums = {2, 7, 11, 15};
        int target = 17;

        int[] result = twoSum(nums, target);

        // Print the result
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
