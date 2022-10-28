class HelloWorldCPP {
    public native void print();

    static {
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("windows")) {
            System.load(System.getProperty("user.dir") + "/build/libs/helloC/shared/helloC.dll");
        } else if (os.contains("linux")) {
            System.load(System.getProperty("user.dir") + "/build/libs/helloC/shared/libhelloC.so");
        }
    }

    public static void main(String[] args) {
        new HelloWorldCPP().print();
    }
}
