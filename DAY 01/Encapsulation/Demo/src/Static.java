public class Static {
    int a ;
    public void notstaticMethoda(){
        System.out.println("this method call for need Object references like Static s1 = new Static/ s1.methoda neame ");
    }
    public static void staticMethod(){
        System.out.println("no need to call object references because this a static method");
    }
}
