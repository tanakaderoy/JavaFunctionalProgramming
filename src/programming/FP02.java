package programming;

import java.util.List;
import java.util.stream.Collectors;

public class FP02 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(12,9,13,4,6,2,4,12,15);
        List<Integer> squares = addToListOfSquares(nums);
        System.out.println(squares);
    }

    private static List<Integer> addToListOfSquares(List<Integer> nums) {
        return nums.stream().map(num -> num * num).collect(Collectors.toList());
    }

    private static int addAllNums(List<Integer> nums) {
//nums.stream().reduce(0,(a,b)-> a+b).get()
        return nums.stream().reduce(0,Integer::sum);
    }

    private static int addAllNumsForLoop(List<Integer> nums) {
        int ans = 0;
        for (Integer num : nums) {
            ans += num;
        }
        return ans;
    }
}
