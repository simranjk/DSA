class Solution {
    public int removeElement(int[] nums, int val) {

        int temp;
        int j = nums.length - 1;

        for (int i = 0; i <= j; i++) {
            if (nums[i] == val) {
                while (i < j && nums[j] == val) {
                    j--;
                }
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;       
                j--;
            } 
        }
        return j + 1;
    }
}