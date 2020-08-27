package Singleton;

public class Shape {

    private static Shape shapeObject = new Shape();

    private Shape() {
    }

    public static Shape getInstance(){
            return shapeObject;
    }

    public void shapeMethod(){
        System.out.println("This is a shape");
    }
}
