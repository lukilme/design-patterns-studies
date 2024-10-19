package Cooperative;

public class Main {
    static {
        System.loadLibrary("rust_lib"); 
    }

    public native void my_function();
    
    public static void main(String[] args) {
        new Main().my_function();
        new CallBack();
        CallBack.tellme("Cats");
    }
}
