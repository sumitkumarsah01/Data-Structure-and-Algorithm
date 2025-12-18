public class largestOfThreeNum {
    public static void main(String[] args) {
        int a=40;
        int b=1;
        int c=9;

        if(a>b && a>c){
            System.out.print("A is largest Num = "+a);
        }
        else if(b>a && b>c){
            System.out.print("B is largest Num = "+b);
        }
        else{
            System.out.print("C is largest Num = "+c);
        }
    }
    
}
