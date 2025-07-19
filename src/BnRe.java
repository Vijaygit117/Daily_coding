public class BnRe {
    public static void main(String[] args) {
       int[] arr={1,22,333,4444,5555,66666,777777};
       int target=2313;
       int res=search(arr,target,0,arr.length-1);
        System.out.println(res);
    }
    static int search(int[] arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(arr[m]>target){
           return search(arr,target,s,m-1);//e=m-1;
        }

        return search(arr,target,m+1,e);


    }

}
