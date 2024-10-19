use jni::objects::{JClass, JString};
use jni::sys::jobject;
use jni::JNIEnv;

#[no_mangle]
pub extern "system" fn Java_Cooperative_Main_my_1function() {    
    println!("Hello, Rust");
}

#[no_mangle]
pub extern "system" fn Java_Cooperative_CallBack_my_1second_1function(
    env: JNIEnv,
    _class: JClass,
    input: JString,
) {
    let java_str = env.get_string(input).expect("Couldn't get java string!");
    let rust_str = java_str.to_str().expect("Couldn't convert java string to Rust string!");

    println!("Hello from Rust: {}", rust_str);
}