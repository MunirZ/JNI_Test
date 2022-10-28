#include <jni.h>
#include <stdio.h>

JNIEXPORT void JNICALL Java_HelloWorldC_print(JNIEnv *env, jobject obj)
{
    printf("Hello from C!\n");
    return;
}