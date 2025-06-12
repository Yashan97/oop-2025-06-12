public class Static {
    int a ;
    public void notstaticMethoda(){
        System.out.println(" public void notstaticMethoda() - this method call for need Object references like Static s1 = new Static/ s1.methoda neame ");
    }
    public static void staticMethod(){
        System.out.println("public static void staticMethod() - no need to call object references because this a static method");

    }
}
