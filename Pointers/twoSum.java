package Pointers;

import java.util.Arrays;

class twoSum {
    public int[] twoSum(int[] numbers, int target) {
        Arrays.sort(numbers);
        int left  = 0;
        int right = numbers.length-1;
        

        while(left<right){
            int sum = numbers[left] + numbers[right];

            if(sum == target){
                left++;
                right++;
                return new int[] {left,right};
            }
            if(sum < target){
                left++;
            }
            if(sum > target){
                right--;
            }
        }
        return new int [] {};
    }
}