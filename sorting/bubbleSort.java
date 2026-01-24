public class bubbleSort{
    public static boolean bubble(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            boolean check=true;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    check=false;
                }
            }
            if(check==true){
                return check;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={5,3,2,6,8,1};
        bubble(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}