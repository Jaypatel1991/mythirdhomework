package method;

public class StaticNonstatic {
    static void myMethod1() {
        System.out.println("My Static method");
    }
    void myMethod2() {
        System.out.println("My NonStatic method");
    }
    public static void main(String[] args) {
        myMethod1();
        StaticNonstatic obj = new StaticNonstatic();
        obj.myMethod2();
    }
}