package factorypattern;

public class ShapeFactory  {

    public static Shape getShape(ShapeEnum shapeEnum) throws Exception {

        if(shapeEnum == null){
            throw new Exception();
        }

        if(shapeEnum == ShapeEnum.CIRCLE){
           return new Circle();
        }
        if(shapeEnum == ShapeEnum.RECTANGLE){
            return new Rectangle();
        }

        if(shapeEnum == ShapeEnum.HEXAGON){
            return new Square();
        }

        if(shapeEnum == ShapeEnum.PENTAGON){
            return  new Pentagon();
        }

        if(shapeEnum == ShapeEnum.RHOMBUS){
            return new Rhombus();
        }

        if(shapeEnum == shapeEnum.SQUARE){
            return new Square();
        }

        throw new Exception();
    }

}
