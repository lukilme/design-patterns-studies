use jni::objects::{JObject, JString};
use jni::sys::jobject;
use jni::JNIEnv;
use std::ffi::CStr;

#[no_mangle]
pub extern "system" fn Java_Example_my_1rust_1function() {
    println!("Hello, rust");
}

#[no_mangle]
pub extern "system" fn Java_Example_my_1second_1rust_1function(env: JNIEnv, obj: jobject, input: JString) {
    // Convert the Java string (jstring) to a Rust string
    let java_str = env.get_string(input).expect("Couldn't get java string!");
    let rust_str = java_str.to_str().expect("Couldn't convert java string to Rust string!");
    
    // Print the Rust string
    println!("{}", rust_str);
}