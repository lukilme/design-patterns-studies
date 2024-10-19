package Cooperative;

public class CallBack {
    static {
        System.loadLibrary("rust_lib"); 
    }
    public native void my_second_function(String aux);

    public static void tellme(String aux){
        new CallBack().my_second_function(aux);
    } 
}
