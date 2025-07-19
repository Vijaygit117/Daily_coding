public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};int target = 5;
        int res=searchInsert(nums,target);
        System.out.println(res);
//        Output: 2
    }

        static int searchInsert(int[] nums, int target) {
            int start=0;
            int last=nums.length-1;
            while(start<=last){

                int middle=start+(last-start)/2;

                if(nums[middle]<target){
                    start=middle+1;
                }
                else if(nums[middle]>target){
                    last=middle-1;

                }
                else{
                    return middle;
                }

            }
            return start;
        }

}
