public class Main {

    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop();

        Furniture f1 = shop.createFurnitureById(1, "Black");
        System.out.println(f1);

        f1 = shop.createFurnitureById(2, "yellow");
        System.out.println(f1);
    }
}
