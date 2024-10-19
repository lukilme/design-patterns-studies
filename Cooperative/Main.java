package Cooperative;

public class Main {
    static {
        System.loadLibrary("rust_lib"); 
    }
    public static native void my_rust_function();

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        new Main().my_rust_function(); 
    }
}
