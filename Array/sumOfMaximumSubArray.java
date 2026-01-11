public class sumOfMaximumSubArray {
    public static int sumSubarray(int arr[]){
        int curr=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                curr=0;
                for(int k=start;k<=end;k++){
                    curr=curr+arr[k];
                }
                System.out.println(curr);
                if(curr>max){
                    max=curr;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        int ans=sumSubarray(arr);
        System.out.println(ans);
    }
    
}
