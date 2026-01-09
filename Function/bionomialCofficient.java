public class bionomialCofficient {
    public static int fac(int num){
        int result=1;
        for(int i=1;i<=num;i++){
            result=result*i;
        }
        return result;
    }


    public static int bionomialCo(int n,int r){
        int fac_n=fac(n);
        int fac_r=fac(r);
        int fac_n_r=fac(n-r);
        int ans=fac_n/(fac_r*fac_n_r);
        return ans;
    }
    public static void main(String[] args) {
        int finalans=bionomialCo(5, 2);
        System.out.println(finalans);
        
    }
    
}
