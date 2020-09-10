import java.util.ArrayList;

public class FurnitureFactory {


    private static FurnitureFactory factory = null;

    public static void Instantiate(){
        if (factory == null) {
            factory = new FurnitureFactory();
        }
    }

    public static FurnitureFactory getFactory(){
        return factory;
    }

    public Furniture createFurnitureById(int id, String color) {
        if (id == 1) {
            return new Chair(color);
        }
        return new Bookshelf(color);
    }


    private FurnitureFactory() {

    }
}
