public class PassObject {
    public void printAreas(Circle001 c, int times) {
        System.out.println("Radius\t\tArea");
        for (int i = 1; i <= times; i++) {
            c.setRadius(i);
            System.out.println(c.getRadius() + "\t\t" + c.findArea());
        }
    }
}
