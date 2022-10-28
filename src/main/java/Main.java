public class Main {
    public static void main(String[] args) {
        HelloWorldC helloC = new HelloWorldC();
        HelloWorldCPP helloCPP = new HelloWorldCPP();

        helloC.print();
        helloCPP.print();
        System.out.println("Hello from Java!");
    }
}