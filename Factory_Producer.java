package lab_work;

public class Factory_Producer {
   public static Abstract_Factory getFactory(String choice) {
       if(choice.equalsIgnoreCase("SHAPE"))
           return new Shape_Factory();
       else if(choice.equalsIgnoreCase("COLOR"))
           return new Color_Factory();
       return null;
   } 
}
