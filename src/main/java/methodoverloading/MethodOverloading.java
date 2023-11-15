package methodoverloading;

public class MethodOverloading {
    static int myMethod(int a, int b){
        return a+b;
    }
    static double myMethod(double a,double b){
        return a-b;
    }
    public static void main(String[] args) {
        int i = myMethod(10, 20);
        double f = myMethod(30.10, 40.10);
        System.out.println(i);
        System.out.println(f);
        //  System.out.println(myMethod(10, 20));
        // System.out.println(myMethod(30.10,40.10));
    }
}