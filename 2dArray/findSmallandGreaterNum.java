public class findSmallandGreaterNum {
    public static int small(int arr[][]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
            }
        }
        return min;
    }

    public static int largest(int arr[][]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[][]={{2,4,3,5},{5,7,6,8},{1,10,18,13}};
        int smallest=small(arr);
        System.out.println(smallest);
        int largest=largest(arr);
        System.out.println(largest);
    }
    
}
