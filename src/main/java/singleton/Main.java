package Singleton;

public class Main {

    public static void main(String args[]){
        Shape s = Shape.getInstance();
        s.shapeMethod();
    }
}