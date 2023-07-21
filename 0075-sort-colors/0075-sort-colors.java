class Solution {
    public void sortColors(int[] nums) {
        int zero = 0;
        int one = 0;
        int two = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zero++;
            } else if (nums[i] == 1) {
                one++;
            } else if (nums[i] == 2) {
                two++;
            }
        }

        for (int i = 0; i < zero; i++) {
            nums[i] = 0;
        }
        for (int j = zero; j < zero + one; j++) {
            nums[j] = 1;
        }
        for (int k = zero + one; k < nums.length; k++) {
            nums[k] = 2;
        }
    }
}
