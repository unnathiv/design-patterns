package factorypattern;

public enum ShapeEnum {



    CIRCLE("Circle"), RECTANGLE("Rectangle"), SQUARE("Square"), RHOMBUS("Rhombus"), PENTAGON("Pentagon"), HEXAGON("Hexagon");

    private String value;

    ShapeEnum(String value) {
        this.value = value;
    }
}
