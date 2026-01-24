import java.util.*;
public class create2dArray {
    public static void create(int arr[][],int n,int m){
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<n;i++ ){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }
    public static void main(String[] args) {
        int arr[][]= new int[3][3];
        int n=arr.length;
        int m=arr[0].length;
        create(arr,n,m);
         for(int i=0;i<n;i++ ){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        
    }
    
}
