import java.util.*;
class FirstLastPos {
    public static void main(String[] args) {

        int[] nums1 = {5,7,7,8,8,10};
        int target1 = 8;

        int[] nums2 = {5,7,7,8,8,10};
        int target2 = 6;

        int[] nums3 = {};
        int target3 = 0;

        System.out.println(Arrays.toString(searchRange(nums1, target1)));
        System.out.println(Arrays.toString(searchRange(nums2, target2)));
        System.out.println(Arrays.toString(searchRange(nums3, target3)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int first = -1, last = -1;
        int left = 0, right = nums.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == target){
                right = mid - 1;
                first = mid;
            }
            else if(nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        left = 0;
        right = nums.length - 1;

        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == target){
                left = mid + 1;
                last = mid;
            }
            else if(nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return new int[]{first, last};
    }
}