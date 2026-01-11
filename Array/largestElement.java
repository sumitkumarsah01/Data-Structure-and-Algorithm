public class largestElement {
    public static int largestEle(int arr[]){
        int largest=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[]={31,4,6,8,1,2,9};
        
        int ans=largestEle(arr);
        System.out.println(ans);
    }
    
}
