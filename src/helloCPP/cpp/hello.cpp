#include <jni.h>
#include <iostream>

#ifndef _Included_Java_HelloWorldCPP
#define _Included_Java_HelloWorldCPP
#ifdef __cplusplus
extern "C" {
#endif

JNIEXPORT void JNICALL Java_HelloWorldCPP_print(JNIEnv *env, jobject thisObj)
{
    std::cout << "Hello World from C++!" << std::endl;
    return;
}
#ifdef __cplusplus
}
#endif
#endif