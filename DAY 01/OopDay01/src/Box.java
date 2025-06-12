public class Box {
    int length = 12;
    int width = 10;
    int height = 5;

    public void printVolume (){
        int volume  = length*width*height;
        System.out.println("printvolume method call - "+volume);
    }

    public void setSize(int a , int b , int c){
        length = a;
        width = b;
        height = c;

        int settot = a*b*c;
        System.out.println("sey size new box- "+settot);
    }
}
