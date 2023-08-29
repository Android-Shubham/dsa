package leetcode;

class FindDuplicateNumber {

    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
    public static int findDuplicate(int[] nums) {
        int start = 0;
        while(start<nums.length){
            int correctIndex = nums[start] - 1;
            if(nums[start]!=nums[correctIndex]){
                swap(nums,start,correctIndex);
            }else{
                start++;
            }
        }


        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                return nums[i];
            }
        }

        return 0;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}