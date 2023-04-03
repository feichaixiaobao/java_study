public class App {
    public static void main(String[] args) {
        Music myMusic = new Music("My Song", 180);
        myMusic.play();
        System.out.println(myMusic.getInfo());
    }
}