import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int x=121;
        int x2=-121;

        System.out.println("is the number: "+x+" ? "+solution.isPalindrome(x));
        System.out.println("is the number: "+x2+" ? "+solution.isPalindrome(x2));
    }
}