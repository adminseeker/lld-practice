public class Application {
    public static void main(String[] args) {
        Shape circle1 = ShapeFactory.getShape("circle", "red");

        //extrinsic state (you can also create a extrinsic state class with variable properties)
        circle1.draw(1, 2, 5);

        Shape circle2 = ShapeFactory.getShape("circle", "red");
        circle2.draw(5,5, 2);

        Shape rectangle1 = ShapeFactory.getShape("rectangle", "blue");
        rectangle1.draw(15, 15, 5);
    }
}
