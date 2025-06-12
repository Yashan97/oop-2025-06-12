public class Demo {
    public static void main(String[] args) {

        Customer customer = new  Customer();
        customer.name = "yashan";
        customer.code = 1234;
        customer.salary = 75000.0;
        customer.gendere = "male";

        System.out.println("name is - "+customer.name);
        System.out.println("code is - "+customer.code);
        System.out.println("gender is - "+customer.gendere);
        System.out.println("salary is - "+customer.salary);


        Box b1 = new Box();
        int vol = b1.height * b1.width * b1.length;
        System.out.println("BOX capasity is - "+vol);

        b1.printVolume(); // method declaration
        b1.setSize(50,10,20); // method declaration with parameters

        Box b2 = new Box();
        b2.setsizewithsameNameVariable(20,70,80); // use this keyword

    }
}