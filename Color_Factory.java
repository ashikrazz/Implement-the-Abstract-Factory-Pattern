package lab_work;

public class Color_Factory extends Abstract_Factory {
    @Override
    public Shape getShape(String Shape_Type) {
        return null;
    }
    @Override
    Color getColor(String color) {
        if(color == null)
            return null;
        if(color.equalsIgnoreCase("RED"))
            return new Red();
        else if(color.equalsIgnoreCase("GREEN"))
            return new Green();
        else if(color.equalsIgnoreCase("BLUE"))
            return new Blue();
        return null;
    }
}
