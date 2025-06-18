package LeetCode;

public class JumpGame {
    public boolean canJump(int[] nums) {
        int maxIndex = 0;
        for (int i=0; i<nums.length; i++) {
            if (i>maxIndex) return false;
            maxIndex = Math.max(maxIndex, i+nums[i]);
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Jump Game");
        int[] nums = {2,1,1,0,4};
        JumpGame jg = new JumpGame();
        System.out.println(jg.canJump(nums) ? "True" : "False");
    }
}
