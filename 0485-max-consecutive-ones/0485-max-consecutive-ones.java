class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int num = nums.length;
        int count = 0;
        int result = 0;

        for (int i = 0; i < num; i++) {
            if (nums[i] == 1) {
                count++;

                result = Math.max(result, count);

            } else {
                count = 0;
            }
        }
        return result;
    }
}