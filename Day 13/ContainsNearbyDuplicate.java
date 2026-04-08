import java.util.*;
public class ContainsNearbyDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums, k));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int idx = 0; idx < nums.length; idx++){
            if(map.containsKey(nums[idx])){
                int prevIdx = map.get(nums[idx]);
                if(idx - prevIdx <= k){
                    return true;
                }
            }
            map.put(nums[idx], idx);
        }
        return false;
    }
}