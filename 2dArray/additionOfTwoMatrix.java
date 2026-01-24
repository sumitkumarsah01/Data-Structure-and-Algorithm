import java.util.*;
public class additionOfTwoMatrix {
    public static void Printarr(int arr[][],int r1,int c1){
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }


    public static void Add(int arr1[][],int r1,int c1,int arr2[][],int r2,int c2){
        if(r1!=r2||c1!=c2){
            System.out.println("User give Wrong Dimension");
            return;
        }

        int sum[][]=new int [r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }
            System.out.println();
        }

        Printarr(sum, r1, c1);
    }
    
    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the row num");
       int r1=sc.nextInt();
       System.out.println("Enter the col num");
       int c1=sc.nextInt();
       int arr1[][]=new int[r1][c1];  

       for(int i=0;i<r1;i++){
        for(int j=0;j<c1;j++){
            arr1[i][j]=sc.nextInt();
        }
       }

      Printarr(arr1, r1, c1);
       System.out.println("Enter the row num");
       int r2=sc.nextInt();
       System.out.println("Enter the col num");
       int c2=sc.nextInt();
       int arr2[][]=new int[r2][c2];  

       for(int i=0;i<r2;i++){
        for(int j=0;j<c2;j++){
            arr2[i][j]=sc.nextInt();
        }
       }
       Printarr(arr2, r2, c2);

       Add(arr1, r1, c1, arr2, r2, c2);
       


       

    


    }
    
}
