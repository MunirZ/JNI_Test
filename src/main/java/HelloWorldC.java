class HelloWorldC {
    public native void print();

    static {
        System.load(System.getProperty("user.dir") + "/build/libs/helloC/shared/helloC.dll");
    }

    public static void main(String[] args) {
        new HelloWorldC().print();
    }
}
