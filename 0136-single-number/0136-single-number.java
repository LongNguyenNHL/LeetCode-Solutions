class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        int[] positive = new int[3 * 10 * 10 * 10 * 10];
        int[] negative = new int[3 * 10 * 10 * 10 * 10];
        
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num >= 0) {
                positive[num]++;
            } else {
                negative[-num]++;
            }

        }
        for (int i = 0; i < positive.length; i++) {
            if (positive[i] == 1) {
                result = i;
                return result;
            }
        }

        for (int i = 0; i < negative.length; i++) {
            if (negative[i] == 1) {
                result = -i;
            }
        }
        return result;
    }
}