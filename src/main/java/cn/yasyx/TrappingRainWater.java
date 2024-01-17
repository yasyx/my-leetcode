package cn.yasyx;

public class TrappingRainWater {

    public static void main(String[] args) {
        new Solution().trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1});
    }

    static class Solution {
        public int trap(int[] height) {
            int sum = 0;
            int max_left = 0;
            int[] max_right = new int[height.length];
            for (int i = height.length - 2; i >= 0; i--) {
                max_right[i] = Math.max(max_right[i + 1], height[i + 1]);
            }
            for (int i = 1; i < height.length - 1; i++) {
                max_left = Math.max(max_left, height[i - 1]);
                int min = Math.min(max_left, max_right[i]);
                if (min > height[i]) {
                    sum = sum + (min - height[i]);
                }
            }
            return sum;
        }
    }

}
