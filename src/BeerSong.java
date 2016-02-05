/**
 * Created by Eric on 2/4/2016.
 */
public class BeerSong {

    public static void main(String[] args) {
        Ninety_Nine_Bottles_of_Beer();

    }
    public static void Ninety_Nine_Bottles_of_Beer()
    {
        for (int x=99; x >=0; x--)
            if (x > 2){
                System.out.println(x+ " bottles of beer on the wall " +x+ " bottles of beer.");
                System.out.print("Take one down, pass it around, "+(x-1)+" bottles of beer on the wall.\n");

            }
            else if (x==2){
                System.out.println(x+ " bottles of beer on the wall " +x+ " bottles of beer.");
                System.out.print("Take one down, pass it around, "+(x-1)+" bottle of beer on the wall.\n");
            }
            else if ( x==1){
                System.out.println(x+ " bottle of beer on the wall " +x+ " bottle of beer.");
                System.out.print("Take one down, pass it around, no bottles of beer on the wall.\n");
            }



    }


}
