public class primeOrNot {
    public static boolean checkPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
              return false;
            }
            
        }
        return true;
    }
    public static void main(String[] args) {
        boolean ans=checkPrime(5);
        if(ans==true){
            System.out.println("Our Number is Prime");
        }
        else{
            System.out.println("Our number is not prime");
        }
        
    }
    
}
