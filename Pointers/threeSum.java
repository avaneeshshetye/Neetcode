package Pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class threeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        int left = 1;
        int right = nums.length-1;
        
        for(int i=0; i<nums.length; i++){
            while(left<right){
                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                }
                if(left<right){
                    left++;
                }
                if(left>right){
                    right--;
                }
            }
        }
         return new ArrayList<>(result);
    }
}
