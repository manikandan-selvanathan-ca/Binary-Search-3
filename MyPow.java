public class MyPow {

    public double myPow(double x, int n) {
        if(n == 0) {
            return 1.0;
        }    
         
        double currentResult =  myPow(x, n/2);
        if(n%2 == 0) {
            return currentResult * currentResult;
        } else {
            if(n >0) {
                 return currentResult * currentResult * x;      
            } else {
                return currentResult * currentResult * (1/x);    
            }
        }
        
    }

    public static void main(String[] args) {
        MyPow myPow = new MyPow();
        double result = myPow.myPow(2, 10);
        System.out.println("The result is"+result);

    }
}