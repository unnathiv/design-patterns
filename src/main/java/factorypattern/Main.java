package factorypattern;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws Exception {

        while(true) {

            Scanner sc = new Scanner(System.in);
            String val = sc.nextLine();

            if(val.equalsIgnoreCase("exit")){
                break;
            }
            Shape resultObject = ShapeFactory.getShape(ShapeEnum.valueOf(val));
            resultObject.draw();
        }
    }
}
