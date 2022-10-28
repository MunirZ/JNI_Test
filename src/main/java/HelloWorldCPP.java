class HelloWorldCPP {
    public native void print();

    static {
        System.load(System.getProperty("user.dir") + "/build/libs/helloCPP/shared/helloCPP.dll");
    }

    public static void main(String[] args) {
        new HelloWorldCPP().print();
    }
}
