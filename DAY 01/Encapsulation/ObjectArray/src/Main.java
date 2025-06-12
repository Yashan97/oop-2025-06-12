//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Box [] boxArray = new Box[4];
        boxArray[0] = new Box(10,20,30);
        boxArray[1] = new Box(100,200,300);
        boxArray[2] = new Box(1,2,3);
        boxArray[3] = new Box(105,205,305);

        boxArray[0].printVolume();
        boxArray[1].printVolume();
        boxArray[2].printVolume();
        boxArray[3].printVolume();

        for (int x =0; x<boxArray.length; x++){
            boxArray[x].printVolume();
        }
        for (Box b1:boxArray){
            b1.printVolume();
        }
    }
}