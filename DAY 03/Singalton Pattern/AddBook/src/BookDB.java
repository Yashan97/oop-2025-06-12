public class BookDB {
    private static BookDB ob;
    private  BookDB(){

    }
    public static BookDB getInstance(){
        if (ob== null){
            ob = new BookDB();
        }
        return ob;
    }

}
