class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> maps = new HashMap<>();
        int result = 0;
        int repetition = 0;

        for (int i = 0; i < nums.length; i++) {
            int value = 1;
            if (maps.containsKey(nums[i])) {
                value = maps.get(nums[i]);
                maps.put(nums[i], value + 1);
            } else {
                maps.put(nums[i], value);
            }
        }

        for (int i : maps.keySet()) {
            if (repetition < maps.get(i)) {
                repetition =  maps.get(i);
                result = i;
            }
        }
        return result;
    }
}