public class kadaneAlgorithm{
    public static int kadane(int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currSum=currSum+arr[i];
            System.out.println(currSum);
            if(currSum<0){
                currSum=0;
            }
            maxSum=Math.max(maxSum, currSum);
            System.out.println(maxSum);

        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        int maxSum=kadane(arr);
        System.out.println(maxSum);
    }

    
}