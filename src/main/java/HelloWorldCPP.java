class HelloWorldCPP {
    public native void print();

    static {
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("windows")) {
            System.load(System.getProperty("user.dir") + "/build/libs/helloCPP/shared/helloCPP.dll");
        } else if (os.contains("linux")) {
            System.load(System.getProperty("user.dir") + "/build/libs/helloCPP/shared/libhelloCPP.so");
        }
    }

    public static void main(String[] args) {
        new HelloWorldCPP().print();
    }
}
