import java.util.ArrayList;

public class FurnitureShop {
    private ArrayList<Furniture> furnitureLayouts = new ArrayList<>();
    private FurnitureFactory factory;

    public FurnitureShop() {
        FurnitureFactory.Instantiate();
        this.factory = FurnitureFactory.getFactory();
        fillLayoutList();
        greet();
    }

    private void fillLayoutList() {
        furnitureLayouts.add(new Chair("white"));
        furnitureLayouts.add(new Bookshelf("white"));
    }

    private void greet() {
        System.out.println("Welcome to our Furniture Shop!");
        System.out.println("Choose one of our awesome layouts with every color tou want!");
        for (int i = 0; i < furnitureLayouts.size(); i++) {
            System.out.printf("%d) - %s\n", furnitureLayouts.get(i).getFurnitureTypeId(),
                    furnitureLayouts.get(i).getDescription());
        }
    }

    public Furniture createFurnitureById(int id, String color) {
        return factory.createFurnitureById(id, color);
    }
}
