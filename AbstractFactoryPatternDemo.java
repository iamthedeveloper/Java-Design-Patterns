package AbstractFactory;
public class AbstractFactoryPatternDemo {
   public static void main(String[] args) {

      //get shape factory
      AbstractaFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

      //get an object of Shape Circle
      Shape shape1 = shapeFactory.getShapeFactory(ShapeConstants.CIRCLE);

      //call draw method of Shape Circle
      shape1.draw();

      //get an object of Shape Rectangle
      Shape shape2 = shapeFactory.getShapeFactory(ShapeConstants.RECTANGLE);

      //call draw method of Shape Rectangle
      shape2.draw();
      

      //get color factory
      AbstractaFactory colorFactory = FactoryProducer.getFactory("COLOR");

      //get an object of Color Red
      Color color1 = colorFactory.getColorFactory(ColorConstants.RED);

      //call fill method of Red
      color1.applyColor();

      //get an object of Color Green
      Color color2 = colorFactory.getColorFactory(ColorConstants.GREEN);

      //call fill method of Green
      color2.applyColor();


   }
}