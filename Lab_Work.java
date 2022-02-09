package lab_work;

public class Lab_Work {

    public static void main(String[] args) {
        Abstract_Factory shape_Factory = Factory_Producer.getFactory("SHAPE");
        Shape shape_one = shape_Factory.getShape("CIRCLE");
        shape_one.draw();
        Shape shape_two = shape_Factory.getShape("RECTANGLE");
        shape_two.draw();
        Shape shape_three = shape_Factory.getShape("SQUARE");
        shape_three.draw();
        
        Abstract_Factory color_Factory = Factory_Producer.getFactory("COLOR");
        Color color_one = color_Factory.getColor("RED");
        color_one.fill();
        Color color_two = color_Factory.getColor("GREEN");
        color_two.fill();
        Color color_three = color_Factory.getColor("BLUE");
        color_three.fill();
    }
    
}
