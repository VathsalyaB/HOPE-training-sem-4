class SortedRotated {
    public static void main(String[] args) {
        System.out.println(check(new int[]{2, 3, 4, 1, 3}));
    }
    public static boolean check(int[] nums) {
        int count = 0;
        int i = 0;
        while(i < nums.length){
            if(nums[i] > nums[(i + 1) % nums.length]) count++;
            i++;
        }
        if(count > 1) return false;
        else return true;
    }
}