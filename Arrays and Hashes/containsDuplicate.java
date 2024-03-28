import java.util.HashSet;

class containsDuplicate {
    public boolean containsDuplicatee(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            int element = nums[i];

            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
