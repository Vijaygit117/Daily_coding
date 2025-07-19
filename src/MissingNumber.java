public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={9,6,4,2,3,5,7,0,1};

        System.out.println(missingNumber(arr));
    }

        static void swap(int[] arr,int i,int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        static int missingNumber(int[] nums) {
            int index=0;
            while(index<nums.length){
                int correct=nums[index];

                if(correct <nums.length && nums[index]!=nums[correct]){
                    swap(nums,index,correct);
                }
                else index++;
            }
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=i){
                    return i;

                }
            }
            return nums.length;

        }
    }

