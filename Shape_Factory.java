package lab_work;

public class Shape_Factory extends Abstract_Factory {
    @Override
    public Shape getShape(String shape_Type) {
        if(shape_Type == null)
            return null;
        if(shape_Type.equalsIgnoreCase("CIRCLE"))
            return new Circle();
        else if(shape_Type.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();
        else if(shape_Type.equalsIgnoreCase("SQUARE"))
            return new Square();
        return null;
    }
   @Override
   Color getColor(String color) {
       return null;
   }
} 
