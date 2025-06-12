public class Box {
        int a;
        int b;
        int c;

        Box(int a, int b, int c){
            this.a = a;
            this.b = b;
            this.c = c;

        }
        public void printVolume(){
            int volume ;
            volume = a*b*c;
            System.out.println("box volime is - "+volume);
        }

}
