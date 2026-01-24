import java.util.Scanner;

public class transposeOfMatrix {
     public static void Printarr(int arr[][],int r1,int c1){
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    // public static void transpose(int arr[][],int r1,int c1){
    //     int trans[][]=new int[c1][r1];
    //     for(int i=0;i<c1;i++){
    //         for(int j=0;j<r1;j++){
    //             trans[i][j]=arr[j][i];
    //         }
    //         System.out.println();
    //     }
    //    Printarr(trans, c1, r1);
    // }


    public static void Inplacetranspose(int matrix[][],int r1,int c1){
        
        for(int i=0;i<r1;i++){
            for(int j=i;j<c1;j++){
                
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;

            }
            System.out.println();
        }
       Printarr(matrix, r1, c1);
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
    //   transpose(arr1, r1, c1);
      Inplacetranspose(arr1,r1,c1);
    }
    
}
