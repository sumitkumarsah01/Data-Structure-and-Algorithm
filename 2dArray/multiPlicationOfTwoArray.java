import java.util.*;
public class multiPlicationOfTwoArray {
    public static void Printarr(int arr[][],int r1,int c1){
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void mul(int arr1[][],int r1,int c1,int arr2[][],int r2,int c2){
        if(c1!=r2){
            System.out.println("wrong dimension");
            return;
        }
        int mul[][]=new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    mul[i][j]+=arr1[i][k]*arr2[k][j];
                }
                
            }
            System.out.println();
        }
        Printarr(mul, r1, c2);
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

       mul(arr1, r1, c1, arr2, r2, c2);
       


       

    


    }
    
}


