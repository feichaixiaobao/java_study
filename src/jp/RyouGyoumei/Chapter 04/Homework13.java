public class Homework13 {
    public static void main(String[] args) {
        PassObject passObj = new PassObject();
        Circle Circle01 = new Circle01(0);
        passObj.printAreas(Circle01, 5);
        System.out.println("Now radius is " + Circle01.radius);
    }
}
