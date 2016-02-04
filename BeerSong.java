public class BeerSong {

    public static void main(String[] args) {
        Nintey_Nine_Bottles_of_Beer();
        System.out.println("1 more bottle of beer on the wall, one more bottle of beer!");
        System.out.println("Take one down, pass it around, no more bottles of beer on the wall!");
    }
    public static void Nintey_Nine_Bottles_of_Beer() {
        int i;
        for (i=99; i > 1;) {
            System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer!");
            i = i-1;
            System.out.println("Take one down, pass it around, " + i + " bottles of beer on the wall!");
        }
    }
    
}
