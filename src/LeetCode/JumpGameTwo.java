package LeetCode;

import java.util.Arrays;

public class JumpGameTwo {
    public int jumpSteps(int[] nums) {
        int jumps = 0, currentEnd = 0, farthest = 0;
        for (int i=0; i<nums.length-1; i++) {
            farthest = Math.max(farthest, i+nums[i]);
            if (i==currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
        }
        return jumps;
    }
    public static void main(String[] args) {
        System.out.println("Jump Game 2");
//        int[] nums = {2,3,1,1,4};
        int[] nums = {1,2};
        JumpGameTwo jg = new JumpGameTwo();
        System.out.println(jg.jumpSteps(nums));
    }
}
