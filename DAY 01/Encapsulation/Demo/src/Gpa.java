public class Gpa {
    private int sinhala;
    private int  maths;
    private  int english;

    public Gpa( int sinhala,int maths,int english){  //this is a Parameterized Constructor
        this.english = english;
        this.maths = maths;
        this.sinhala = sinhala;
    }

    public int getSinhala() {
        return sinhala;
    }

    public void setSinhala(int sinhala) {
        this.sinhala = sinhala;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public void calculation(){
        System.out.println("sinhala - "+sinhala);
        System.out.println("maths - "+maths);
        System.out.println("english - "+english);
    }
}
