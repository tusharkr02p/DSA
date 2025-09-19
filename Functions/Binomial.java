public class Binomial {
   
    
    public static int facto(int n){
        int f= 1; 
        for(int i = 1 ; i <= n ; i++ ) f = f * i;
        return f;
    }

    public static int Binomial_Coef(int n , int r){
         int a = facto(n);
         int b= facto(r);
         int c = facto(n - r);

         return a / (b *c);
    }
    public static void main(String[] args) {
        System.out.println(Binomial_Coef(5, 2));
    }
    
}


