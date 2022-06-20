public class Fibonacci {
    
    public static int serieFibonacci(int n, int n1, int n2, int n3){
        if(n == n3){
            return n1;
        } else {
            System.out.println(n1);
            n++;
            return serieFibonacci(n, n2, n1+n2, n3);
        }
    }
}
