import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int [] nums = {1,4,3,9,5};
        int target = 4;

        System.out.println(Arrays.toString(solution.twoSum(nums,target)));
    }
}