public class Main {
    public static void main(String[] args) {
        Circle001 c = new Circle001(0);
        PassObject p = new PassObject();
        p.printAreas(c, 5);
        System.out.println("The radius is " + c.getRadius());
    }
}
