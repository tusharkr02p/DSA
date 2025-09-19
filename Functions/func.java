public class func {
    public static void PrintHello(){
        System.out.println("Hello World");
    }

    public static int  sum(int a , int b){
         return a + b;  
    }
    public static void main(String args[]){
        // PrintHello();

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number1");
        // int a = sc.nextInt();
        // System.out.println("Enter the number2");
        // int b = sc.nextInt();

        //      int sum = sum( a , b);
        //     System.out.println( "Sum is : " + sum);


        int a =10;
        int b = 5;
         int temp = a;
         a= b;
         b =temp;
        System.out.println("a : "  + a + "b: "+b); 

       
        // System.out.println("sum is : " + sum);
        // sc.close();
    }
}