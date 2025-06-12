//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Date d1 = new Date();
        d1.setDate(2025,1,26);
        d1.printDate();


        Gpa g1 = new Gpa(75,80,90);
        int newEnglsih = g1.getEnglish();
        System.out.println(newEnglsih);
        g1.calculation();

        Test t1 = new Test();
        t1.a = 1;
        t1.b = 20;

        Test t2 = new Test();
        t2.a = 555;
        t2.b = 777;

        System.out.println("t1 - "+t1.a+" "+t1.b);
        System.out.println("t2 - "+t2.a+" "+t2.b);


        // calling static method and non static method

        Static s1 = new Static();
        s1.notstaticMethoda();

        Static.staticMethod();
    }
}