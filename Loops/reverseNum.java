public class reverseNum {
    public static void main(String[] args) {
        int num=10899;
        int lastdigit=0;
        int rev=0;
        while(num>0){
            //first way
            // reverse=num%10;
            // System.out.println(reverse);
            // num=num/10;

            // second way
            lastdigit=num%10;
             rev=(rev*10)+lastdigit;
             num=num/10;

        }
        System.out.println(rev);
        
    }
    
}
